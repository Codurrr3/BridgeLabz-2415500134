public class FibonacciRecursion {

    static int fib(int n) {

        // Base case
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        // Recursive case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 6;

        for(int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
