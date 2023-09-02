import java.util.*;

public class Repract12{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a=scan.nextInt();

        if(a==1){
             System.out.print("JANUARY");
        }
        else if(a==2){
             System.out.print("FEBRAURY");
        }
        else if(a==3){
             System.out.print("MARCH");
        }
        else if(a==4){
             System.out.print("APRIL");
        }
        else if(a==5){
             System.out.print("MAY");
        }
        else if(a==6){
             System.out.print("JUNE");
        }
        else if(a==7){
             System.out.print("JULY");
        }
        else if(a==8){
             System.out.print("AUGUST");
        }
        else if(a==9){
             System.out.print("SEPTEMBER");
        }
        else if(a==10){
             System.out.print("OCTOMBER");
        }
        else if(a==11){
             System.out.print("NOVEMBER");
        }
        else if(a==12){
             System.out.print("DECEMBER");
        }
        else{
            System.out.print("Enter the number between(1-12)");
        }
    }
}