import java.util.Scanner;

public class SomarDezUsuario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int res = 0;

        System.out.println("Insira um número: ");

        Loop_somar_números:
        for(int i = 0; i < 10; i++) {
            int num = ler.nextInt();
            res += num;

            if(i == 9){
                break Loop_somar_números;
            } else {
                System.out.println("Agora insira outro número:");
            }
        }

        System.out.println("A soma dos números digitados é: " + res);

    }
}
