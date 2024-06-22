
import java.util.Scanner;


// class array {

//     public int[] arr;

//     public array(int[] arr) {
//         this.arr = arr;
//     }

//     public void printOdd() {
//         System.out.println("Odd: ");
//         for (int num : arr) {
//             if (num % 2 != 0) {
//                 System.out.print(num + " ");
//             }
//         }
//         System.out.println();
//     }

//     public void printEven() {
//         System.out.println("Even: ");
//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 System.out.print(num + " ");
//             }
//         }
//         System.out.println();
//     }
// }

// public class Odd_and_Even_an_Array {

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         array obj = new array(arr);
//         obj.printOdd();
//         obj.printEven();
//     }
// }


import java.util.Scanner;
class array{
    public int[] arr;
    public array(int []arr){
        this.arr=arr;
    }
    public void printOdd(){
        System.out.println("Odd: ");
        for(int num:arr){
            if(num%2 !=0){
                System.out.print(num +" ");
            }
        }
        System.out.println();
    }
    public void printEven(){
        System.out.println("Even: ");
        for(int num:arr){
            if(num%2 ==0){
                System.out.print(num +" ");
            }
        }
        System.out.println();
    }
}
public class Odd_and_Even_an_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size =scanner.nextInt();
        int [] arr = new int[size];
        System.out.print("Array Elelment: ");
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        
        array obj=new array(arr);
        obj.printOdd();
        obj.printEven();
        scanner.close();
    }
}
