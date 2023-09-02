import java.util.*;

public class Repract18{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter you are Operation 'add','sub','multi','division','modules' : ");
        String ops=scan.nextLine();

        System.out.print("Enter value of A : ");
        int a=scan.nextInt();

        System.out.print("Enter value of B : ");
        int b=scan.nextInt();

        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;

        if(ops.equals("add")){
            System.out.print("The sum of :"+c);
        }
        
        else if(ops.equals("sub")){
            System.out.print("The sub of :"+d);
        }
        
        else if(ops.equals("multi")){
            System.out.print("The multi of :"+e);
        }
        
        else if(ops.equals("division")){
            System.out.print("The Division of :"+f);
        }
        
        else if(ops.equals("modules")){
            System.out.print("The Module of :"+g);
        }
        else{
            System.out.print("Enter a correct operation");
        }
    }
}