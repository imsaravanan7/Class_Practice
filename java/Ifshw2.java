import java.util.Scanner;

public class Ifshw2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        double num;

        System.out.print("Enter A Num : ");
        num=scan.nextDouble();

        if(num%3==0){
            System.out.print("The given num is multiple of 3 ");
        }
        else{
            System.out.print("The given num is not multiple of 3 ");
        }
    }
}