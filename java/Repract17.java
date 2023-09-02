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
            System.out.println("The greatest num is A ");
            if(b>c){
                System.out.println("The Second greatest num is B ");
                System.out.println("The smallest num is C ");
            }
            else{
                System.out.println("The second greatest num is C ");
                System.out.println("The smallest num is B ");
            }
        }
        
        else if(b>a && b>c){
            System.out.println("The greatest num is B ");
            if(a>c){
                System.out.println("The Second greatest num is A ");
                System.out.println("The smallest num is C ");
            }
            else{
                System.out.println("The Second greatest num is C ");
                System.out.println("The smallest num is A ");
            }
        }
        
        else if(c>b && c>a){
            System.out.println("The greatest num is C ");
            if(a>b){
                System.out.println("The Second greatest num is A ");
                System.out.println("The smallest num is B ");
            }
            else{
                System.out.println("The Second greatest num is B ");
                System.out.println("The smallest num is A ");
            }
        }
        else{
            System.out.print("Error Enter a Correct value ");
        }
    }
}