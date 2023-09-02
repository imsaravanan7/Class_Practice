import java.util.Scanner;

class Testif5{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        int a;

        a=val.nextInt();

        if(a%4==0){
            System.out.print("The given year is leap");
        }
        else{
            System.out.print("The given year is not leap");
        }
    }
}