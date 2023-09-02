import java.util.Scanner;       //if condition <>

class Testif2{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        int a;

        a=val.nextInt();

        if(a>0){
            System.out.println("The num is positive");
        }
        if(a<0){
            System.out.println("The num is Negative");
        }
    }
}