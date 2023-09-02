import java.util.Scanner; // b 10 input from user addition with a

class Test12{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        int a=10;
        int b;

        b=val.nextInt();
        a+=b;
        System.out.println(a);

        b=val.nextInt();
        a+=b;
        System.out.println(a);
        
        b=val.nextInt();
        a+=b;
        System.out.println(a);

        b=val.nextInt();
        a+=b;
        System.out.println(a);

        b=val.nextInt();
        a+=b;
        System.out.println(a);

        b=val.nextInt();
        a+=b;
        System.out.println(a);

        System.out.println(--a);
    }
}