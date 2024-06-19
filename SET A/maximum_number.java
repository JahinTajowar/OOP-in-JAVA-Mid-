
import java.util.Scanner;

public class maximum_number {
    public int a,b,c;
    public maximum_number(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int find(){
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Take three int: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        maximum_number find = new maximum_number(a, b, c);
        System.out.println("Maximim number is" + find.maximum_number());
    }
    scanner.close();
    
}
