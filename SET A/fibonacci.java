import java.util.Scanner;

public class fibonacci {
    public int n, a, b, c;

    // Constructor to initialize the values
    public fibonacci(int n, int a, int b, int c) {
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void generateFibonacci() {
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for your target: ");
        int n = scanner.nextInt();
        scanner.close();
        
        // Create an instance of Fibonacci class
        fibonacci fibonacciSeries = new fibonacci(n, 0, 1, 0);
        
        // Generate the Fibonacci series
        fibonacciSeries.generateFibonacci();
    }
}
