import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Criar Conta Corrente");
        System.out.println("2 - Criar Conta Poupança");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Consultar Saldo");

        System.out.print("Digite a operação: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                MovimentaConta.criarCorrente();
                break;
            case 2:
                MovimentaConta.criarPoupanca();
                break;
            case 3:
                MovimentaConta.movSaque();
                break;
            case 4:
                MovimentaConta.movDeposito();
                break;
            case 5:
                MovimentaConta.consultaSaldo();
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }

    }
}
