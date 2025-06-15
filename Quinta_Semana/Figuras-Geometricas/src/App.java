import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao = null, repetir = "sim";

        System.out.println("Seja bem vindo a calculadora de area e perímetro:".toUpperCase());
        System.out.print("\nInsira a opção desejada!");

        while(repetir.equalsIgnoreCase("sim")) {
            System.out.println("\nDigite 'QUADRADO' para selecionar");
            System.out.println("Digite 'RETÂNGULO' para selecionar");
            System.out.println("Digite 'TRIÂNGULO' para selecionar");
            System.out.println("Digite 'LOSANGULO' para selecionar");
            System.out.println("Digite 'CIRCULO' para selecionar");
            System.out.print("Qual sua opçao? ");
            opcao = sc.nextLine();

            FigurasGeometricas opcao2 = FigurasGeometricas.fromGeometric(opcao);

            System.out.println("Resposta: " + Calculando.calculando(opcao2) + "\n");

            System.out.print("Deseja repetir? (Sim ou Não?) ");
            repetir = sc.nextLine();
        }
    }
}
