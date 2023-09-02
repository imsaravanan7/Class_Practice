import java.util.*;

public class Calswitch{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a OPeration : ");
        String name=scan.nextLine();

        System.out.print("The value of A : ");
        int a=scan.nextInt();
        System.out.print("The value of B : ");
        int b=scan.nextInt();

        switch(name){
            case "add":
                System.out.print("The sum of "+(a+b));
                break;
            case "sub":
                System.out.print("The sum of "+(a-b));
                break;
            case "multi":
                System.out.print("The sum of "+(a*b));
                break;
            case "division":
                System.out.print("The sum of "+(a/b));
                break;
            default:
                System.out.print("Unknown operation");
            
        }
    }
}