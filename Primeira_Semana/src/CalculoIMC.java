import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.String;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.print("Insira a altura (em metros, usando ',' para separar os metros dos centrimetros): ");
        double altura = sc.nextInt();
        System.out.print("Insira o peso:" );
        double peso = sc.nextDouble();

        if(alturaString.contains(".")) {
            alturaString.replace("." , ",");
            altura = Double.parseDouble(alturaString);
        }

        double imc = peso / Math.pow(altura, 2);

        if(imc < 18.5) {
            System.out.println("Seu IMC é " + format.format(imc).replace(",", ".") + ", logo, você esta na classificação: Abaixo do peso.");
        } else if(imc >= 18.5 && imc < 25) {
            System.out.println("Seu IMC é " + format.format(imc).replace(",", ".") + ", logo, você esta na classificação: Peso normal.");
        } else if(imc >= 25 && imc < 30) {
            System.out.println("Seu IMC é " + format.format(imc).replace(",", ".") + ", logo, você esta na classificação: Sobrepeso.");
        } else if(imc >= 30 && imc < 35) {
            System.out.println("Seu IMC é " + format.format(imc).replace(",", ".") + ", logo, você esta na classificação: Obesidade grau I.");
        } else if(imc >= 35 && imc < 40) {
            System.out.println("Seu IMC é " + format.format(imc).replace(",", ".") + ", logo, você esta na classificação: Obesidade grau II.");
        } else {
            System.out.println("Seu IMC é " + format.format(imc).replace(",", ".") + ", logo, você esta na classificação: Obesidade grau III.");
        }
        sc.close();
    }
}
