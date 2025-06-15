import java.util.Scanner;

public class Calculando {
    public static double calculando (FigurasGeometricas opcao) {
        Scanner sc = new Scanner(System.in);

        return switch (opcao) {
            case QUADRADO -> {
                System.out.print("Deseja calcular a área ou o perimetro? ");
                String opcao2 = sc.nextLine();
                FigurasGeometricas opcao3 = FigurasGeometricas.fromGeometric(opcao2);
                System.out.print("Insira o valor do lado: ");
                double lado = sc.nextDouble();

                if(opcao3.equals(FigurasGeometricas.PERIMETRO)) {
                    yield lado * 4;
                } else if(opcao3.equals(FigurasGeometricas.AREA)) {
                    yield Math.pow(lado, 2);
                } else {
                    yield 0;
                }
            }

            case RETANGULO -> {
                System.out.print("Deseja calcular a área ou o perimetro? ");
                String opcao2 = sc.nextLine();
                FigurasGeometricas opcao3 = FigurasGeometricas.fromGeometric(opcao2);
                System.out.print("Insira o valor do lado horizontal: ");
                double lado1 = sc.nextDouble();
                System.out.print("Insira o valor do lado vertical: ");
                double lado2 = sc.nextDouble();

                if(opcao3.equals(FigurasGeometricas.PERIMETRO)) {
                    yield (lado1 * 2) + (lado2 * 2);
                } else if(opcao3.equals(FigurasGeometricas.AREA)) {
                    yield lado1 * lado2;
                } else {
                    yield 0;
                }
            }

            case TRIANGULO -> {
                double[] lados = new double[3];

                System.out.print("Deseja calcular a área ou o perimetro? ");
                String opcao2 = sc.nextLine();
                FigurasGeometricas opcao3 = FigurasGeometricas.fromGeometric(opcao2);

                for (int i = 0; i < 3; i ++) {
                    System.out.println("Insira o valor do " + i + "° lado");
                    lados[i] = sc.nextDouble();
                }

                if(opcao3.equals(FigurasGeometricas.PERIMETRO)) {
                    yield lados[0] + lados[1] + lados[2];
                } else if(opcao3.equals(FigurasGeometricas.AREA)) {
                    double res = (lados[0] + lados[1]  + lados[2]) / 2;
                    yield (Math.sqrt(res * (res - lados[0]) * (res - lados[1]) * (res - lados[2])));
                } else {
                    yield 0;
                }
            }

            case LOSANGULO -> {
                System.out.print("Deseja calcular a área ou o perimetro? ");
                String opcao2 = sc.nextLine();
                FigurasGeometricas opcao3 = FigurasGeometricas.fromGeometric(opcao2);
                System.out.print("Insira o valor do lado: ");
                double lado = sc.nextDouble();

                if(opcao3.equals(FigurasGeometricas.PERIMETRO)) {
                    yield lado * 4;
                } else if (opcao3.equals(FigurasGeometricas.AREA)) {
                    System.out.print("Insira o ângulo em graus interno: ");
                    double graus = sc.nextDouble();

                    double diagonalMaior = lado * Math.sqrt(2 * (1 + Math.cos(Math.toRadians(graus))));
                    double diagonalMenor = lado * Math.sqrt(2 * (1 - Math.cos(Math.toRadians(graus))));

                    yield (diagonalMaior * diagonalMenor) / 2;
                } else {
                    yield 0;
                }
            }

            case CIRCULO -> {
                System.out.print("Deseja calcular a área ou o perimetro? ");
                String opcao2 = sc.nextLine();
                FigurasGeometricas opcao3 = FigurasGeometricas.fromGeometric(opcao2);
                System.out.print("Insira o valor do raio: ");
                double raio = sc.nextDouble();

                if(opcao3.equals(FigurasGeometricas.PERIMETRO)) {
                    yield 2 * Math.PI * raio;
                } else if(opcao3.equals(FigurasGeometricas.AREA)) {
                    yield Math.PI * Math.pow(raio, 2);
                } else {
                    yield 0;
                }
            }

            default -> throw new IllegalStateException("Valor inesperado: " + opcao);
        };
    }
}
