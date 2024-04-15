package aula03;

public class Ex01 {
    public static void main(String[] args) {

        int Fibonacci[] = new int[10];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;

        for (int i = 0; i < 10; i++) {
            Fibonacci[i+2] = Fibonacci[i] + Fibonacci[i + 1];
            System.out.println(Fibonacci[i]);
        }
    }
}
