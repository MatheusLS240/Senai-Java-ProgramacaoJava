import java.text.DecimalFormat;
import java.util.Scanner;

public class SistemaPosto {
    public static void main(String[] agrs) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double res = 0.00;
        int quantidadeAtual = 0;
        final double precoLitro = 5.75;

        System.out.println("Eae chefe, vai colocar quanto hoje?");
        double quantidadeTotal = sc.nextDouble();
        System.out.println(quantidadeTotal + " Litros de gasolina ou R$ " + quantidadeTotal +  "?");
        String opcao = sc.next();

        // Calcula o quantos litros o consumidor final vai receber pagando a quantidade X de valor.
        if(opcao.equalsIgnoreCase("reais")) {
            do {
                res = quantidadeAtual / precoLitro;
                System.out.print("Litros: " + df.format(res) + " \r");
                quantidadeAtual++;
                Thread.sleep(300);
            } while (quantidadeAtual < quantidadeTotal);
        }
        // Calcula quanto o consumidor final irá pagar colocando a quantidade X de gasolina.
        else if (opcao.equalsIgnoreCase("gasolina")) {
            do {
                res = quantidadeAtual * precoLitro;
                System.out.print("Valor: " + df.format(res) + " \r");
                quantidadeAtual++;
                Thread.sleep(300);
            } while (quantidadeAtual < quantidadeTotal);
        }
        // Caso o consumidor diga algo que não tem no posto, o frentista irá ficar confuso.
        else {
            System.out.println("Ta doidão em!");
        }
    }
}
