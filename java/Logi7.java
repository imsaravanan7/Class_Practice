import java.util.Scanner;

public class Logi7{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        int age;
        System.out.print("Enter Ur Age : ");
        age=val.nextInt();

        if(age<=17 && age>=0){
            System.out.print("You are a 'Miner'");
        }
        else if(age<=65 && age>=18){
            System.out.print("You are a 'Major'");
        }
        else if(age<=100 && age>=65){
            System.out.print("You are a 'Senior citizen'");
        }
        else{
            System.out.print("Enter Your 'Correct Age'");
        }
        
        
        
    }
}