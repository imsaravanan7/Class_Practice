import java.util.*;

public class Oddswitch{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter value of A : ");
        int a=scan.nextInt();
        int a1=a%2;

        switch(a1){
            case (0):
                    System.out.println("The number is Even");
                    if(a%4==0){
                        System.out.println("The number is Divided by 4");
                    }
                    else{
                        System.out.println("The number is not Divided by 4");
                    }
                break;
                case (1):
                    System.out.println("The number is Odd");
                    if(a%3==0){
                        System.out.println("The number is Divided by 3");
                    }
                    else{
                        System.out.println("The number is not Divided by 3");
                    }
                    break;
                default:
                    System.out.print("enter the correct value");
        }
    }
}