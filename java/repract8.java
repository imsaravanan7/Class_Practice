import java.util.*;

public class Repract8{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int a=scan.nextInt();
        
        if(a%2==0){
            System.out.print("The given num is even");
        }
        else{
            System.out.print("The given num is odd");   
        }
    }
}