import java.util.*;

public class Revision_3_Formula{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter a Value of A : ");
        int a=scan.nextInt();
        System.out.print("Enter a Value of B : ");
        int b=scan.nextInt();
        System.out.print("Enter a Value of C : ");
        int c=scan.nextInt();
        System.out.print("Enter a Value of H : ");
        int h=scan.nextInt();

        System.out.println("The area is : "+(float)(b*h)/2);
        System.out.println("The peremeter is : "+(a+b+c));
        
    }
}