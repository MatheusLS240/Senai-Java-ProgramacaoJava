public class ArrayCont2 {
    public static void main(String[] args) {
        int[][] numeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        numeros[0][1] = 10;

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.println(numeros[i][j]);
            }
        }
    }
}
