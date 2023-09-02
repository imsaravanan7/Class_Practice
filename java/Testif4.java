import java.util.Scanner;

class Testif4{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a;
        int b;

        System.out.print("Enter the number : ");
        a=scan.nextInt();
        System.out.print("Enter the number : ");
        b=scan.nextInt();

        if(a>b){
            System.out.println("a is greater than b ");
        }
        else{
            System.out.println("b is greater than a ");
        }
    }
}