import java.util.Scanner;
class maximum{
    public int[] arr;
    public maximum(int[] arr){
        this.arr=arr;
    }

    public int find(){
        int f,s,t;
        f=s=t=Integer.MIN_VALUE;
        for(int num: arr){
            if(num>f){
                t=s;
                s=f;
                f=num;
            }
            else if (num>s) {
                t=s;
                s=num;
            }
            else if(num>t){
                t=num;
            }
        }
        return t;
    }

}
public class TMaximum_in_an_array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Take arry size: ");
        int size =scanner.nextInt();
        int[] arr=new int [size];
        System.out.print("Enter Elements: ");
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        maximum obj = new maximum(arr);
        System.out.println("Third max num: "+obj.find());

        scanner.close();
    }
    
}
