import java.util.Scanner;

class Test6{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        double a;
        double b;
        System.out.print("Enter value of A : ");
        a=val.nextDouble();
        System.out.print("Enter value of B : ");
        b=val.nextDouble();
        //double c=(a*a)+(b*b)+(2*(a*b));
        double c =(a*a)+(b*b)/(a+b);
        System.out.println("The Sum of " + c);
    }
}