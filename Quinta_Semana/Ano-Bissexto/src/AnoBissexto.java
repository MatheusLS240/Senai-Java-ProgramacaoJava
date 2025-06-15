import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao sistema de encontrar ano bissexto\n".toUpperCase());
        System.out.println("Insira o ano: ");
        int ano = sc.nextInt();
        System.out.println(acharAnoBissexto(ano));
    }

    public static String acharAnoBissexto(int ano) {
        if(ano % 4 == 0 && ano % 100 != 0) {
            return ano + " é um ano Bissexto";
        } else if (ano % 100 == 0 && ano % 400 == 0){
            return ano + " é um ano Bissexto";
        } else {
            return ano + " não é um ano Bissexto";
        }
    }
}