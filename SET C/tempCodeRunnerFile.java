import java.util.Scanner;

class arrayOperation {

    public int[] arr;

    public arrayOperation(int[] arr) {
        this.arr = arr;
    }

    public void rightRode(int n) {
        int len = arr.length;
        n = n % len;
        revArr(arr, 0, len - 1);
        revArr(arr, 0, n - 1);
        revArr(arr, n, len - 1);
    }

    public void revArr(int[] arr, int strt, int end) {
        while (strt < end) {
            int temp = arr[strt];
            arr[strt] = arr[end];
            arr[end] = temp;
            strt++;
            end--;
        }
    }

    public void printarr() {
        for (int num : arr) {
            System.out.print("Result: " + num + " ");
        }
        System.out.println();
    }
}

public class array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter arraay size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of Rotetion: ");
        int Rotetion = scanner.nextInt();
        // int[] arr = {1, 2, 3, 4, 5};
        arrayOperation obj = new arrayOperation(arr);
        obj.rightRode(Rotetion);
        obj.printarr();
        scanner.close();
    }
}
