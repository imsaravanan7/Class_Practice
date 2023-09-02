import java.util.Scanner;

class Test3{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        int a;
        int b;
        System.out.print("Enter value of A : ");
        a=val.nextInt();

        System.out.print("Enter value of B : ");
        b=val.nextInt();
        

        double c=a+b;
        double d=a-b;
        double e=a*b;
        double f=a/b;
        double g=a%b;
        
        System.out.println("The Sum of : "+c);
        System.out.println("The sub of : "+d);
        System.out.println("The Multi of : "+e);
        System.out.println("The Division of : "+f);
        System.out.println("The Remainder of :"+g);
    }
}