// *** for Diclaretion ****

// public class area_of_circle {
//     public double radious;

//     public area_of_circle(double radious){
//         this.radious = radious;
//     }

//     public double  calculate(){
//         return Math.PI * radious;
//     }

//     public static void main(String[] args) {
//         area_of_circle object = new area_of_circle(5.0);
//         System.out.println("Area is: " + object.calculate());
//     }
// }

/////////////////////////////////////////////


// *** for Initialization ****
import java.util.Scanner;
public class area_of_circle {
    public double radious;

    public area_of_circle(double radious){
        this.radious = radious;
    }

    public double  calculate(){
        return Math.PI * radious;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Take the radious: ");
        double radious = scanner.nextDouble();
        area_of_circle object = new area_of_circle(radious);
        System.out.println("Area is: " + object.calculate());
        scanner.close();
    }
}
