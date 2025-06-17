import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String nome;
        double pc;
        double alt;
        String genero; // Sexo da pessoa
        double cintura; // Circunferência abdominal

        // 1) Desserialização: recuperando os objetos gravados no arquivo binário "dados.dat"
        ArrayList<Object> pessoa = Empacotamento.lerArquivoBinario("dados.dat");

        // 2) Entrada de dados
        while (true) {
            System.out.printf("Ficha nro: %d.\n", (pessoa.size() + 1));
            System.out.printf("Informe o nome da pessoa, FIM para encerrar:\n");
            nome = ler.nextLine();

            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            // Validação do gênero
            while (true) {
                System.out.printf("\nInforme o Gênero (M - Masculino ou F - Feminino): ");
                genero = ler.nextLine().trim().toUpperCase();

                if (genero.equals("M")) {
                    System.out.println("Gênero selecionado: Masculino.");
                    break;
                } else if (genero.equals("F")) {
                    System.out.println("Gênero selecionado: Feminino.");
                    break;
                } else {
                    System.out.println("Opção inválida! Por favor, insira apenas 'M' ou 'F'.");
                }
            }

            System.out.printf("\nInforme o peso corporal (em kg): ");
            pc = ler.nextDouble();

            System.out.printf("Informe a circunferência abdominal (em cm): ");
            cintura = ler.nextDouble();

            System.out.printf("Informe a altura (em metros - ex: 1.77): ");
            alt = ler.nextDouble();

            pessoa.add(new Pessoa(nome, pc, alt, genero, cintura)); // adiciona novo objeto à lista

            ler.nextLine(); // Limpa o buffer do teclado
            System.out.printf("\n");
        }

        // 3) Serialização: gravando o objeto no arquivo binário "dados.dat"
        Empacotamento.gravarArquivoBinario(pessoa, "dados.dat");

        ler.close(); // Boa prática: fechar o Scanner
    }
}
