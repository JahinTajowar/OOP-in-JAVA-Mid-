// *** for diclaretion *****

// class Reverse_a_String{
//     public String str;

//     public Reverse_a_String(String str){
//         this.str = str;
//     }

//     public String reverse() {
//         StringBuilder sb = new StringBuilder(str);
//         return sb.reverse().toString();
//     }
//     public static void main(String[] args) {
//         Reverse_a_String sm = new Reverse_a_String("Jehin Tajowar Masud");
//         System.out.println("Reverse : "+sm.reverse());
//     }
// }

///////////////////////////////////////////////////////


// *** for initialization ****

import java.util.Scanner;
public class Reverse_a_String{
    public String str;

    public Reverse_a_String(String str){
        this.str = str;
    }

    public String reverse() {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Take a String or Integer: ");
        String input = scanner.nextLine();
        
        Reverse_a_String sm = new Reverse_a_String(input);
        System.out.println("Reverse : "+sm.reverse());
        scanner.close();
    }
}


