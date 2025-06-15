import java.text.DecimalFormat;

public class Calculadora {
    DecimalFormat df = new DecimalFormat("#.##");

    public static double calcular(double a, double b, Operacoes opcao) {
        return switch (opcao) {
            case SOMA -> a + b;
            case SUBTRACAO -> a - b;
            case MULTIPLICACAO -> a * b;
            case DIVISAO -> (b != 0) ? a / b : erro("Divisão por zero");
            case EXPOENTE -> Math.pow(a, b);
            default -> erro("Operação inválida");
        };
    }

    public static double calcular(double a, Operacoes operacao) {
        return switch (operacao) {
            case RAIZ -> (a >= 0) ? Math.sqrt(a) : erro("Raiz de número negativo");
            case SENO -> Math.nextUp(Math.sin(Math.toRadians(a)));
            case COSSENO -> Math.cos(Math.toRadians(a));
            case TANGENTE -> Math.tan(Math.toRadians(a));
            default -> erro("Operação inválida");
        };
    }

    private static double erro(String mensagem) {
        System.out.println("Erro: " + mensagem);
        return Double.NaN;
    }
}
