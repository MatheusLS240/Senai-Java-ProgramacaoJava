public class Fibonacci {
    public static void main(String[] args) {
        int i = 0, j = 1;

        System.out.println("A sequencia de Fibonacci é:");
        do {
            System.out.print(i + " ");
            System.out.print(j + " ");
            i += j;
            j += i;
        } while(i <= 100);
        System.out.println(i);
    }
}
