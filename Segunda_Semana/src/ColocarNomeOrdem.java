import java.util.Scanner;

public class ColocarNomeOrdem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = {"Matheus", "Pietro", "Ana", "Carlos Roberto Tobo"};
        char[] letras = new char[100];
        int opcao = 0, i = 0, letraInicial = 0;;

        while(opcao != 1) {
//            System.out.println("Insira os nomes: ");
//            nomes[i] = sc.next();
            i++;

            System.out.println("Deseja parar (Sim = 1 / Não = 0)");
            opcao = sc.nextInt();
        }


        for(i = 0; i < nomes.length; i++) {
            letras[i] = nomes[i].charAt(0);
        }

        for(char letra : letras) {
            System.out.println(letra);
        }

    }
}
