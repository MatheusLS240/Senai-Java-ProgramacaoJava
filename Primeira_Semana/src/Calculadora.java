import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double res;

        System.out.print("Insira o valor do primeiro valor: ");
        double num1 = ler.nextDouble();
        System.out.print("Insira o valor do segundo número: ");
        double num2 = ler.nextDouble();
        System.out.print("Insira a operação que deseja fazer: (+ - * /): ");
        String opcao = ler.next();

        switch (opcao) {
            case "+":
                res = num1 + num2;
                System.out.println("Opção de adição selecionada! O resultado é " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Opção de subtração selecionada! o resultado é " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Opção de multiplicação selecionada! o resultado é " + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println("Opção de divisão selecionada! o resultado é " + res);
                break;
        }
        ler.close();
    }
}
