// ******* for initialization ******

// import java.util.Scanner;

// public class prime_number {

//     public int n;

//     public prime_number(int n) {
//         this.n = n;
//     }

//     public void claculate() {
//         for (int i = 2; i <= n; i++) {
//             if (prime(i)) {
//                 System.out.print(i + " ");
//             }

//         }

//     }

//     public boolean prime(int num) {
//         if (num <= 1) {
//             return false;
//         }

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Take a number: ");
//         int n = scanner.nextInt();
//         prime_number obj = new prime_number(n);
//         obj.claculate();
//         scanner.close();
//     }
// }

/////////////////////////////////////////////////

//// *********For diclaretion **********


public class prime_number {

    public int n;

    public prime_number(int n) {
        this.n = n;
    }

    public void claculate() {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }

        }

    }

    public boolean prime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        prime_number obj = new prime_number(10);
        obj.claculate();
    }
}
