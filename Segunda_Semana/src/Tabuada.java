import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insíra qual tabu");
        int num1 = ler.nextInt();

        for(int i = 0; i <= 10; i++) {
            int res = num1 * i;
            System.out.println(num1 + " X " + i + " = " + res);
        }
    }
}