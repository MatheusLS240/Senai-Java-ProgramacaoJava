public class Fatorial {
    public static void main(String[] args){
        long fatorial = 1;

        for(int i = 1; i <= 20; i++) {
            fatorial *= i; // fatorial = faotorial * i
            System.out.println("O Fatorial de " + i + " é " + fatorial);
        }
    }
}
