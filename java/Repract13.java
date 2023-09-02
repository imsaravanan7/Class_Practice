import java.util.*;

public class Repract9{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=scan.nextInt();

        if(a<18 && a>0){
            System.out.print("You are Miner");
        }
        else if(a>=18 && a<65){
            System.out.print("You are Major");
        }
        else{
            System.out.print("You are Senior Citizen");
        }
    }
}