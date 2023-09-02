import java.util.*;     //Armstrong Number

public class For_loop_Test13{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int digit1=0;
        int digit2=0;
        int digit3=0;

        System.out.print("Enter a Number : ");
        int num=scan.nextInt();

        for(num=1; num<=500; num++){
            int temp=num;
            digit1=temp%10;

            temp=temp/10;
            digit2=temp%10;

            temp=temp/10;
            digit3=temp%10;
            
            if(digit1*digit1*digit1+digit2*digit2*digit2+digit3*digit3*digit3==num){
                System.out.println(num);
            }
        }
    }

}