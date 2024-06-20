import java.util.Scanner;

public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        Cylinder cyl = new Cylinder(radius, height);
        System.out.println("The volume of the cylinder is: " + cyl.calculateVolume());
        scanner.close();
    }
}
