import java.util.*;

public class Repract7{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int amount=scan.nextInt();
        int a=amount/100*(3);
        int b=a*5+amount;

        System.out.println("The intrest amount is : "+b);

    }
}