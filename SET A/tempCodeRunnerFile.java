import java.util.Scanner;
public class LeapYearCheck {
public int year;
public LeapYearCheck(int year)
{
    this.year= year;
} 
public boolean isleapYear()
{
if( (year%4==0; && year%100!=0) || (year %400 == 0) )
{
    return true;
}
else return false;
}

public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Take an Year: ");
    int year= scanner.nextInt();
    if(isleapYear(year))
    {
        System.out.println(year + " is Leap Year");
    }
    else System.out.println(year+"is Not a leap Year");
    Scanner.close();
}
    
}