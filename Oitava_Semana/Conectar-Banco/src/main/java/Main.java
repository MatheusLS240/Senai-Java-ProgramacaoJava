import java.sql.*;
import java.util.*;

public class Main {
    private static final String DB_URL = "jdbc:sqlite:banco.db";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                // criarTabela(conn);
                menu(conn);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }

    private static void criarTabela(Connection conn) throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS pessoas (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nome TEXT NOT NULL,
                sobrenome TEXT NOT NULL,
                endereco TEXT NOT NULL,
                rg TEXT NOT NULL,
                salario REAL NOT NULL
            );
        """;
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    private static void menu(Connection conn) throws SQLException{
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                \n1 - Inserir registro
                2 - Atualizar registro
                3 - Deletar registro
                4 - Listar registros
                0 - Sair
                Escolha: """);
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> inserir(conn, sc);
                case 2 -> atualizar(conn, sc);
                case 3 -> deletar(conn, sc);
                case 4 -> listar(conn);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        conn.close();
    }

    private static void inserir(Connection conn, Scanner sc) {
        System.out.println("Nome:");
        String nome = sc.nextLine();
        System.out.println("Sobrenome:");
        String sobrenome = sc.nextLine();
        System.out.println("Endereço:");
        String endereco = sc.nextLine();
        System.out.println("RG:");
        String rg = sc.nextLine();
        System.out.println("Salário:");
        double salario = sc.nextDouble();
        sc.nextLine();

        String sql = "INSERT INTO pessoas(nome, sobrenome, endereco, rg, salario) VALUES(?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, sobrenome);
            pstmt.setString(3, endereco);
            pstmt.setString(4, rg);
            pstmt.setDouble(5, salario);
            pstmt.executeUpdate();
            System.out.println("Registro inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }
    }

    private static void atualizar(Connection conn, Scanner sc) {
        System.out.println("ID do registro a ser atualizado:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Novo nome:");
        String nome = sc.nextLine();
        System.out.println("Novo sobrenome:");
        String sobrenome = sc.nextLine();
        System.out.println("Novo endereço:");
        String endereco = sc.nextLine();
        System.out.println("Novo RG:");
        String rg = sc.nextLine();
        System.out.println("Novo salário:");
        double salario = sc.nextDouble();
        sc.nextLine();

        String sql = "UPDATE pessoas SET nome = ?, sobrenome = ?, endereco = ?, rg = ?, salario = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, sobrenome);
            pstmt.setString(3, endereco);
            pstmt.setString(4, rg);
            pstmt.setDouble(5, salario);
            pstmt.setInt(6, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Registro atualizado com sucesso!");
            } else {
                System.out.println("Registro não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
        }
    }

    private static void deletar(Connection conn, Scanner sc) {
        System.out.println("ID do registro a ser deletado:");
        int id = sc.nextInt();
        sc.nextLine();

        String sql = "DELETE FROM pessoas WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Registro deletado com sucesso!");
            } else {
                System.out.println("Registro não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }

    private static void listar(Connection conn) {
        String sql = "SELECT * FROM pessoas";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Registros ---");
            while (rs.next()) {
                System.out.printf("ID: %d | Nome: %s %s | Endereço: %s | RG: %s | Salário: %.2f\n",
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("sobrenome"),
                        rs.getString("endereco"),
                        rs.getString("rg"),
                        rs.getDouble("salario"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
    }
}



