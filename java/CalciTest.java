import java.util.Scanner;

public class CalciTest{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int a;
        int b;
        String calc="multi";

        System.out.print("Enter value of A: ");
        a=scan.nextInt();
        
        System.out.print("Enter value of B: ");
        b=scan.nextInt();
        
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;

        if(calc=="add"){
            System.out.print("The sum of A&B is : "+c);
        }
          if(calc=="sub"){
            System.out.print("The sub of A&B is : "+d);
        }
          if(calc=="multi"){
            System.out.print("The multi of A&B is : "+e);
        }
          if(calc=="division"){
            System.out.print("The division of A&B is : "+f);
        }
    }
}