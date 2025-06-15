public class Array {
    public static void main(String[] args) {
        String[] cars = {"VW", "Fiat", "GM", "Toyota"};
        cars[2] = "Honda";

        for (int i = 0; i < cars.length; i++) {
            System.out.println("O índice de " + cars[i] + " é " + i);
        }


        System.out.println(java.util.Arrays.toString(cars));
    }
}
