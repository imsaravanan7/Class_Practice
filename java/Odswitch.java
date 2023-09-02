import java.util.*;

public class Odswitch{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        int a;
        System.out.print("Enter a Number : ");
        a=val.nextInt();

        int a1 =a%2;

        switch(a1){
            case 0:
                System.out.println("The num is Even");
                if(a%4==0){
                    System.out.print("The num is divided by 4");
                }
                else{
                    System.out.print("The num is not divided by 4");
                }
                break;
            case 1:
                System.out.println("The num is Odd");
                if(a%3==0){
                    System.out.print("The num is divided by 3");
                }
                else{
                    System.out.print("The num is not divided by 3");
                }
                break;
                default:
                    System.out.print("Enter a correct number");
        }

    }
}