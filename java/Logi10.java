import java.util.Scanner;  //IF CONDITION

public class Logi10{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        int a;

        System.out.print("Enter ur purchased Amount : ");
        a=val.nextInt();

        int b=a-a*5/100;

        if(a>=1000){
            System.out.print("Discount Amount : "+b);
        }
        else{
            System.out.print("Ur Amount : "+a);
        }
    }
}