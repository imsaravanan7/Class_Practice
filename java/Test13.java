import java.util.Scanner; //A+B+C = A

class Test13{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        int a;
        int b;
        int c;

        a=val.nextInt();
        b=val.nextInt();
        c=val.nextInt();

        a+=b+c;
       
        System.out.println(a);
    }
}