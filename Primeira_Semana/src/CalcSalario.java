import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcSalario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("#.##");

        System.out.print("Insira seu salário: ");
        double salario = ler.nextDouble();

        double inss = salario * 0.10;
        double fgts = salario * 0.08;
        double salarioLiquido = salario - inss;
        salario += fgts;

        System.out.println("Salário com desconto do INSS: R$" + formatar.format(salarioLiquido));
        System.out.println("Desconto do INSS: R$" + formatar.format(inss));
        System.out.println("Deposito do FGTS: R$" + formatar.format(fgts));
        System.out.println("Custo para empresa: R$" + formatar.format(salario));

        ler.close();
    }
}