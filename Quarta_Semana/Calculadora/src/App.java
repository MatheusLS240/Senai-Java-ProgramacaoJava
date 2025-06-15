import java.util.Scanner;

public class    App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite a operacao: ");
        String opcao = sc.next();

        Operacoes operacao = Operacoes.fromString(opcao);

        if (operacao != null) {
            double res;
            if (operacao == Operacoes.SOMA || operacao == Operacoes.SUBTRACAO ||
                    operacao == Operacoes.MULTIPLICACAO || operacao == Operacoes.DIVISAO ||
                    operacao == Operacoes.EXPOENTE) {

                System.out.print("Insira o segundo valor: ");
                double num2 = sc.nextDouble();

                res = Calculadora.calcular(num1, num2, operacao);
            } else {
                res = Calculadora.calcular(num1, operacao);
            }

            System.out.println("Resultado: " + res);
        } else {
            System.out.println("Operação inválida: " + opcao);
        }
    }
}
