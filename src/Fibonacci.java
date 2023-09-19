import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        n = input.nextInt();

        System.out.println("Fib = " + fibonacci(n));
    }

    static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            long a = 0;
            long b = 1;
            long fib = 0;

            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }

            return fib;
        }
    }
}
