import java.util.Scanner;

public class Factorial {
    public int n;

    public Factorial(int n) {
        this.n = n;
    }

    public long factorial() {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Take a number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Negative numbers are not acceptable.");
        } else {
            Factorial factorialObj = new Factorial(n);
            long fact = factorialObj.factorial();
            System.out.println(n + " Factorial is: " + fact);
        }

        scanner.close();
    }
}
