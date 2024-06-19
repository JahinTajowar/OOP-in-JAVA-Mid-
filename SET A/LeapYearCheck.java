import java.util.Scanner;

public class LeapYearCheck {
    public int year;

    public LeapYearCheck(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = scanner.nextInt();
        
        LeapYearCheck leapYearCheck = new LeapYearCheck(year);
        if (leapYearCheck.isLeapYear()) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        scanner.close();
    }
}
