import java.util.*;     //Square of the number

public class For_loop_Test5{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter a Number : ");
        int num=scan.nextInt();
        System.out.print("Enter a power of num : ");
        int pow=scan.nextInt();
        int multi=1;

        for(int i=1; i<=pow; i++){
            multi *=num;
        }
        System.out.print("The power of given num is : "+multi);
    }
}