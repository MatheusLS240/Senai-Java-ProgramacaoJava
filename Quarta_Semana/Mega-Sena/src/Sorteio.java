public class Sorteio {
    public static int geraNum(int maiorNum, int menorNum, int tipoNum ) {
        return (int) (Math.random() * (maiorNum - menorNum + 1)) + menorNum;
    }

    public static int[] semRepetido(int quantNum, int maiorNum, int menorNum, int num) {
        int[] array = new int[quantNum];
        boolean repetido = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = geraNum(maiorNum, menorNum, num);

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    repetido = true;
                    break;
                }
            }

            if(repetido) {
                array[i] = geraNum(maiorNum, menorNum, num);
            }
        }
        return array;
    }
}
