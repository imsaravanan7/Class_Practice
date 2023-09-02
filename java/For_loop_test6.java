import java.util.*;     //Reverse Integer

public class For_loop_Test6{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scan.nextInt();
        int num1;
        int rev=0;

        for(; num!=0; num=num/10){
            num1=num%10;
            rev=rev*10+num1;
        }
        System.out.print(rev);
    }
}