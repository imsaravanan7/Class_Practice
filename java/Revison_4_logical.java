import java.util.*;

public class Revison_4_logical{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=scan.nextInt();

        if(age>=18 && 65>age){
            System.out.print("Your a Major ");
        }
        else if(age>=65){
            System.out.print("Your a Senior citizen ");
        }
        else{
            System.out.print("Your a Miner ");
        }
    }
}