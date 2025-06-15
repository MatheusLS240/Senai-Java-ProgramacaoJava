import java.util.Scanner;
import java.util.InputMismatchException;

public class MediaAluno {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int res = 0, notas = 0;

        System.out.print("Insira o nome do aluno: ");
        String nome = sc.next();

        while (true) {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.print("Insira a sua " + i + "° nota: ");
                    notas = sc.nextInt();
                    res += verificadoNotas(notas, i, res, sc);
                }
                break;
            }
            catch (InputMismatchException error) {
                System.out.println("\nSEM NÚMEROS DECIMAS - SEM LETRAS - SEM CARACTERES ESPECIAIS");
                res = 0;
                sc.nextLine();
            }
        }

        res /= 7;

        if (res < 50) {
            System.out.print("\nAluno: " + nome + " - Conceito: I - Reprovado!");
        } else if (res <= 65) {
            System.out.println("\nAluno: " + nome + " - Conceito: R - Aprovado!");
        } else if (res <= 80) {
            System.out.println("\nAluno: " + nome + " - Conceito: B - Aprovado!");
        } else {
            System.out.println("\nAluno: " + nome + " - Conceito: MB - Aprovado com Mérito!");
        }
    }

    public static int verificadoNotas(int num, int repeticao, int res, Scanner scanner) {
            while (true) {
                if(num > 100 || num < 0) {
                    System.out.println("Nota Inválida");
                    num = scanner.nextInt();
                } else {
                    if (repeticao != 3) {
                        return num * repeticao;
                    } else {
                        return num * (repeticao + 1);
                    }
                }
            }
        }
    }

