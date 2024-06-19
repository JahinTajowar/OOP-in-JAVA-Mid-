import java.util.Scanner;

public class Palindrome {
    public String s;

    public Palindrome(String s) {
        this.s = s;
    }

    public boolean isPalindrome() {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();

        Palindrome check = new Palindrome(s);
        if (check.isPalindrome()) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }

        scanner.close();
    }
}
