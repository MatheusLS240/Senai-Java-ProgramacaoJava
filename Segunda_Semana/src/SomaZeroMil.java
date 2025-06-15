public class SomaZeroMil {
    public static void main(String[] args) {
        int res = 0;

        System.out.println("Soma de 1 até 1000");
        for(int i = 0; i <= 1_000; i++) {
            res += i;
            System.out.println(res);
        }
    }
}
