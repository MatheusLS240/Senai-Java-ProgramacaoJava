import java.util.Scanner;

public class MovimentaConta {
    public static void criarCorrente() {
        String[] res = cadastro().split(" ");
        System.out.println("\nDados cadastrados:");
        System.out.println("Nome: " + res[0]);
        System.out.println("CPF: " + res[1]);
        System.out.println("Senha: " + res[2]);
        ContaCorrente conta01 = new ContaCorrente(res[0], Integer.parseInt(res[1]), Integer.parseInt(res[2]));
    }

    public static void criarPoupanca() {
        String[] res = cadastro().split(" ");
        System.out.println("\nDados cadastrados:");
        System.out.println("Nome: " + res[0]);
        System.out.println("CPF: " + res[1]);
        System.out.println("Senha: " + res[2]);
        ContaPoupanca conta01 = new ContaPoupanca(res[0], Integer.parseInt(res[1]), Integer.parseInt(res[2]));
    }

    public static void movSaque() {

    }

    public static void movDeposito() {

    }

    public static void consultaSaldo() {

    }

    public static String cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInsira seu nome: ");
        String cadNome = sc.nextLine();
        System.out.print("Insira seu CPF: ");
        String cadCpf = sc.nextLine();
        System.out.print("Insira sua senha: ");
        String cadSenha = sc.nextLine();

        return cadNome + " " + cadCpf + " " + cadSenha;
    }
}
