import java.util.Scanner; //Assignment Operator

class Test11{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        
        System.out.print("Enter vallue of A :");
        a=val.nextDouble();

        System.out.print("Enter vallue of B :");
        b=val.nextDouble();
        
        System.out.print("Enter vallue of C :");
        c=val.nextDouble();
        
        System.out.print("Enter vallue of D :");
        d=val.nextDouble();
        
        System.out.print("Enter vallue of E :");
        e=val.nextDouble();
        
        System.out.print("Enter vallue of F :");
        f=val.nextDouble();

        a+=b;
        System.out.println("The sum of : " +a);

        a-=c;
        System.out.println("The sum of : " +a);

        a*=d;
        System.out.println("The sum of : " +a);

        a/=e;
        System.out.println("The sum of : " +a);

         a%=f;
        System.out.println("The sum of : " +a);

        
    
    }
}