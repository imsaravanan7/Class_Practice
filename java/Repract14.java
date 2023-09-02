import java.util.*;

public class Repract14{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter Value of A : ");
        int a=scan.nextInt();
        
        System.out.print("Enter Value of B : ");
        int b=scan.nextInt();
        
        System.out.print("Enter Value of C : ");
        int c=scan.nextInt();

        if(a>b && a>c){
            System.out.print("The greatest num is A ");
        }
        
        else if(b>a && b>c){
            System.out.print("The greatest num is B ");
        }
        
        else if(c>b && c>a){
            System.out.print("The greatest num is C ");
        }
        else{
            System.out.print("Error Enter a Correct value ");
        }
    }
}