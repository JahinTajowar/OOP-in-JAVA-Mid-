//Reverse a Number and Sum of All Numbers



//***For Diclaretion *****

// class NumberOperations {

//     public int num;
//     public int rev;
//     public int sum;

//     public NumberOperations(int num) {
//         this.num = num;
//         this.rev = rev(num);
//         this.sum = sum(num);
//     }

//     public int rev(int num) {
//         int reversd = 0;
//         while (num != 0) {
//             int dig = num % 10;
//             reversd = reversd * 10 + dig;
//             num /= 10;
//         }
//         return reversd;
//     }

//     public int sum(int num) {
//         int sums = 0;
//         while (num != 0) {
//             sums += num % 10;
//             num /= 10;
//         }
//         return sums;
//     }

//     public int getSum() {
//         return sum;
//     }

//     public int getRev() {
//         return rev;
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         NumberOperations obj = new NumberOperations(12345);
//         System.out.println("Reverse num: " + obj.getRev());
//         System.out.println("Sum num: " + obj.getSum());
//     }
// }


///////////////////////////////////////////////////

// for initialization
import java.util.Scanner;
class NumberOperations {

    public int num;
    public int rev;
    public int sum;

    public NumberOperations(int num) {
        this.num = num;
        this.rev = rev(num);
        this.sum = sum(num);
    }

    public int rev(int num) {
        int reversd = 0;
        while (num != 0) {
            int dig = num % 10;
            reversd = reversd * 10 + dig;
            num /= 10;
        }
        return reversd;
    }

    public int sum(int num) {
        int sums = 0;
        while (num != 0) {
            sums += num % 10;
            num /= 10;
        }
        return sums;
    }

    public int getSum() {
        return sum;
    }

    public int getRev() {
        return rev;
    }
}

public class Reverse_and_sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Take a Num: ");
        int num=scanner.nextInt();
        NumberOperations obj = new NumberOperations(num);
        System.out.println("Reverse num: " + obj.getRev());
        System.out.println("Sum num: " + obj.getSum());
        scanner.close();
    }
    
}
