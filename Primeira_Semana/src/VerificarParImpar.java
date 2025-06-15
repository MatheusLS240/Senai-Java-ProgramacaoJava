import java.util.Scanner;

public class VerificarParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número: ");
        double num = sc.nextDouble();

        if(num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é impar");
        }

        sc.close();
    }
}
