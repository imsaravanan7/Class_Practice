import java.util.Scanner;

public class LogiRe{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Enter value of A : ");
        a=val.nextInt();
        
        System.out.print("Enter value of B : ");
        b=val.nextInt();
        
        System.out.print("Enter value of C : ");
        c=val.nextInt();
        
        if(a>b && a>c){
            System.out.print("A is Greater Than B&C");
        }
        else if(b>a && b>c){
            System.out.print("B is Greater Than A&C");
        }
        else if(c>a && c>b){
            System.out.print("C is Greater Than B&A");
        }
        else{
            System.out.print("Error");
        }
    }
}