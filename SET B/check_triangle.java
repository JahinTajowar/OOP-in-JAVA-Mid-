/// ***** for Diclaretion *****
// public class check_triangle {
//     public int a,b,c;
//     public check_triangle(int a, int b, int c){
//         this.a=a;
//         this.b=b;
//         this.c=c;
//     }
//     public boolean ValidTriangle(){
//         return (a + b + c) ==180;
//     }
//     public static void main(String[] args) {
//         check_triangle obj = new check_triangle(100, 20, 60);
//         if(obj.ValidTriangle()){
//             System.out.println("YES");
//         }
//         else{
//             System.out.println("NO");
//         }
//     }
// }

//////////////////////////////////////


import java.util.Scanner;
public class check_triangle {
    public int a,b,c;
    public check_triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public boolean ValidTriangle(){
        return (a + b + c) ==180;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Take a angle for check triange: ");
        int a = scanner.nextInt();
        System.out.print("Take b angle for check triange: ");
        int b = scanner.nextInt();
        System.out.print("Take c angle for check triange: ");
        int c = scanner.nextInt();
        check_triangle obj = new check_triangle(a,b,c);
        if(obj.ValidTriangle()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        scanner.close();
    }
}

