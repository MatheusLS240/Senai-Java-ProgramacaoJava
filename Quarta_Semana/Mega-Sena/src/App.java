import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao sistema gerador de números!".toUpperCase());
        System.out.println("\nO sistema so consegue gerar esses tipos de números:");
        System.out.println("Unidade");
        System.out.println("Dezena");
        System.out.println("Centena");
        System.out.println("Unidade de Milhar");
        System.out.println("Dezena de Milhar");
        System.out.println("Centena de Milhar\n");

        System.out.println("Qual deseja gerar?");
        String opcao = sc.nextLine();

        TipoNum opcao2 = TipoNum.fromString(opcao);

        System.out.println("Insira quantos números você deseja");
        int quantNum = sc.nextInt();
        System.out.println("Insira o maior valor que pode ser gerado: ");
        int maiorNum = sc.nextInt();
        System.out.println("Insira o menor valor que pode ser gerado");
        int menorNum = sc.nextInt();

        int[] numeros = Operacao.escolhaOperacao(opcao2, maiorNum, menorNum, quantNum);

        System.out.print("Os números gerados são: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
