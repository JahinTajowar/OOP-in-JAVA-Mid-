// import java.util.Scanner;
// class strOpera{
//     public String str;

//     public strOpera(String str){
//         this.str=str;
//     }
//     public int cntVowel(){
//         int cnt =0;
//         String Vowels="aeiouAEIOU";
//         for(char c : str.toCharArray()){
//             if(Vowels.indexOf(c)!=-1){
//                 cnt++;
//             }
//         }
//         return cnt;
//     }
// }
// public class Vowel {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a String: ");
//         String str =scanner.nextLine();
//         strOpera obj = new strOpera(str);
//         System.out.print("Number of Vowel: "+obj.cntVowel());
//         scanner.close();
//     }
// }


class strOpera{
    public String str;

    public strOpera(String str){
        this.str=str;
    }
    public int cntVowel(){
        int cnt =0;
        String Vowels="aeiouAEIOU";
        for(char c : str.toCharArray()){
            if(Vowels.indexOf(c)!=-1){
                cnt++;
            }
        }
        return cnt;
    }
}
public class Vowel {
    public static void main(String[] args) {
        strOpera obj = new strOpera("Jehin Tajowar Masud");
        System.out.print("Number of Vowel: "+obj.cntVowel());
    }
}
