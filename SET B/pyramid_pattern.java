//// *********For diclaretion **********

// public class pyramid_pattern {
//     public int rows;
//     public pyramid_pattern(int rows){
//         this.rows=rows;
//     }

//     public void clalculate(){
//         for (int i=1; i<=rows; i++){
//             for(int j=i; j<rows; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=(2*i-1); k++){
//                 System.out.print("#");
//             }
//             System.out.println();
//         }
//     }

//         public static void main(String[] args) {
//             pyramid_pattern obj =new pyramid_pattern(10);
//             obj.clalculate();
//         }
// }

/////////////////////////////////////////////////////////////////

// ******* for initialization ******

import java.util.Scanner;
public class pyramid_pattern {
    public int rows;
    public pyramid_pattern(int rows){
        this.rows=rows;
    }

    public void clalculate(){
        for (int i=1; i<=rows; i++){
            for(int j=i; j<rows; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.print("Take a number for Pyramid rows: ");
            int n= scanner.nextInt();
            pyramid_pattern obj =new pyramid_pattern(n);
            obj.clalculate();
            scanner.close();
        }
}