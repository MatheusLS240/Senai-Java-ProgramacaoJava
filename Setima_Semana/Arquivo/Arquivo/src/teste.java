import javax.swing.*;
import java.awt.*;

public class teste {
    public static void main(String[] args) {
        // int[] matriz = {1, 2, 3, 4, 5};

        System.out.println(somaArray(1, 2, 3, 4, 5, 6 , 7, 8, 9, 10));
    }

    public static int somaArray(int... nums) {
        int soma = 0;
        for(int num : nums) {
            soma += num;
        }
        return soma;
    }
}
