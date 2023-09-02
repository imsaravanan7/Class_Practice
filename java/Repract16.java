import java.util.*;

public class Repract16{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter ur mark : ");
        int a=scan.nextInt();

        if(a<=100 && a>=90){
            System.out.print("You are Grade is 'A'");
        }
        
        else if(a<90 && a>=80){
            System.out.print("You are Grade is 'B'");
        }
        
        else if(a<80 && a>=70){
            System.out.print("You are Grade is 'C'");
        }
        
        else if(a<70 && a>=60){
            System.out.print("You are Grade is 'D'");
        }
        
        else if(a<60 && a>=50){
            System.out.print("You are Grade is 'E'");
        }
        
        else if(a<50 && a>=35){
            System.out.print("You are Grade is 'F'");
        }
        
        else{
            System.out.print("You are 'Fail'");
        }
    }
}