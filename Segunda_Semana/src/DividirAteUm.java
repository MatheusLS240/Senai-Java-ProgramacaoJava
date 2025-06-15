import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirAteUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;

        System.out.println("Insira um valor: ");
        while(true) {
            try {
                x = sc.nextInt();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Não permitido número Decimal ou letra\nInsira novamente: ");
                sc.nextLine();
            }
        }

        if(x == 1 || x == 0) {
            System.out.println("Número " + x + ", sem calculo!");
        } else {
            while(x != 0) {
                if(x % 2 == 0) {
                    x /= 2;
                } else {
                    x *= 3;
                    x += 1;
                }

                if(x == 1) {
                    System.out.print(x);
                    break;
                }

                System.out.print(x + " -> ");
            }
        }

        System.out.println("\n\nFim da execução!");
    }
}
