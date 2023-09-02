import java.util.Scanner;

public class Oddeven{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int a;
        int b;

        System.out.print("Enter your Random number : ");
        a=scan.nextInt();

        System.out.print("Enter your number(1-6) : ");
        b=scan.nextInt();

        if(a%2==0){
            if(b<=6 && b>=1 && b==1){
                System.out.print("The month is 'Februrary'");
            }
            else if(b<=6 && b>=1 && b==2){
                System.out.print("The month is 'April'");
            }
            else if(b<=6 && b>=1 && b==3){
                System.out.print("The month is 'June'");
            }
            else if(b<=6 && b>=1 && b==4){
                System.out.print("The month is 'August'");
            }
            else if(b<=6 && b>=1 && b==5){
                System.out.print("The month is 'October'");
            }
            else if(b<=6 && b>=1 && b==6){
                System.out.print("The month is 'December'");
            }
            else{
                System.out.print("Enter the correct Number");
            }
        }
        else if(a%2==1){
            if(b<=6 && b>=1 && b==1){
                System.out.print("The month is 'January'");
            }
            else if(b<=6 && b>=1 && b==2){
                System.out.print("The month is 'March'");
            }
            else if(b<=6 && b>=1 && b==3){
                System.out.print("The month is 'May'");
            }
            else if(b<=6 && b>=1 && b==4){
                System.out.print("The month is 'July'");
            }
            else if(b<=6 && b>=1 && b==5){
                System.out.print("The month is 'September'");
            }
            else if(b<=6 && b>=1 && b==6){
                System.out.print("The month is 'November'");
            }
            else{
                System.out.print("Enter the correct Number");
            }
        }
        else{
            System.out.print("Error");
        }
    }
}