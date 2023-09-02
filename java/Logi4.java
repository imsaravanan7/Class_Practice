import java.util.Scanner;

class Logi4{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        int a;

        System.out.print("Enter a NUmber : ");
        a=val.nextInt();

        if(a>=0 && a<=10){
            System.out.println("The given number is between 0 to 10");
        }
        else{
            System.out.println("The given number is not between 0 to 10");
        }
    }
}