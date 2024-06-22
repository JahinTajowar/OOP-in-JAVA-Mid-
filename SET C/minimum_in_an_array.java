// class minimum{
//        public int [] arr;
//        public minimum(int [] arr){
//         this.arr=arr;
//        } 
//        public int find(){
//         int min=arr[0];
//         for(int num:arr){
//             if(num<min){
//                 min=num;
//             }
//         }
//         return min;
//        }
// }
// public class minimum_in_an_array {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6};
//         minimum obj = new minimum(arr);
//         System.out.print("mini: "+obj.find());
//     }
// }

import java.util.Scanner;

class minimum {

    public int[] arr;

    public minimum(int[] arr) {
        this.arr = arr;
    }

    public int find() {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

public class minimum_in_an_array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        minimum obj = new minimum(arr);
        System.out.print("mini: " + obj.find());
        scanner.close();
    }
}
