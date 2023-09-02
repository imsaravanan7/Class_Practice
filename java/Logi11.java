import java.util.Scanner;

public class Logi11{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Enter value of A : ");
        a=scan.nextInt();
        
        System.out.print("Enter value of B : ");
        b=scan.nextInt();
        
        System.out.print("Enter value of C : ");
        c=scan.nextInt();

        if(a>b && a>c){
                System.out.println("A is Greater");
            if(b>c){
                System.out.println("B is Second Greater");
                System.out.println("C is smaller");
            }
            else{
                System.out.println("C is Second Greater");
                System.out.println("B is Smaller");
            }
        }
        else if(b>c && b>a){
                System.out.println("B is Greater");
            if(c>a){
                System.out.println("C is Second Greater");
                System.out.println("A is Smaller");
            }
            else{
                System.out.println("A is Second Greater");
                System.out.println("C is Smaller");
            }
        }
        else if(c>b && c>b){
                System.out.println("C is Greater");
            if(a>b){
                System.out.println("A is Second Greater");
                System.out.println("B is Smaller");
                }
            else{
                System.out.println("B is Second Greater");
                System.out.println("A is Smaller");
            }
        }
        else{
            System.out.print("Error");
        }
    }
}