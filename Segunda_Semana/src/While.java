import java.util.InputMismatchException;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while(num != 25) {
            System.out.println("Digite um número:");
            num = sc.nextInt();
            if(num != 25) {
                System.out.println("Errou! Tente novamente!");
            }
        }
        System.out.println("Acertou");
    }
}