public class Operacao {
    public static int[] escolhaOperacao(TipoNum opcao, int maior, int menor, int quantNum) {
        return switch (opcao) {
            case UNIDADE -> {
                if (maior > 10 || menor < 0) {
                    System.out.println("Os números inseridos não condizem com a unidade selecionada");
                    yield null;
                }
                yield Sorteio.semRepetido(quantNum, maior, menor, 10);
            }
            case DEZENA -> {
                if (maior > 99 || menor < 10) {
                    System.out.println("Os números inseridos não condizem com a dezena selecionada");
                    yield null;
                }
                yield Sorteio.semRepetido(quantNum, maior, menor, 100);
            }
            case CENTENA -> {
                if (maior > 999 || menor < 100) {
                    System.out.println("Os números inseridos não condizem com a centena selecionada");
                    yield null;
                }
                yield Sorteio.semRepetido(quantNum, maior, menor, 1000);
            }
            case UNIDADE_DE_MILHA -> {
                if (maior > 9999 || menor < 1000) {
                    System.out.println("Os números inseridos não condizem com a unidade de milhar selecionada");
                    yield null;
                }
                yield Sorteio.semRepetido(quantNum, maior, menor, 10000);
            }
            case DEZENA_DE_MILHA -> {
                if (maior > 99999 || menor < 10000) {
                    System.out.println("Os números inseridos não condizem com a dezena de milhar selecionada");
                    yield null;
                }
                yield Sorteio.semRepetido(quantNum, maior, menor, 100000);
            }
            case CENTENA_DE_MILHA -> {
                if (maior > 999999 || menor < 100000) {
                    System.out.println("Os números inseridos não condizem com a centena de milhar selecionada");
                    yield null;
                }
                yield Sorteio.semRepetido(quantNum, maior, menor, 1000000);
            }
        };

    }
}