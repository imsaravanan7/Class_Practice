import java.util.*;

public class Forloop4{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        int a;
        System.out.print("Enter the number : ");
        a=scan.nextInt();
        for(int i=1;i<=a*a;i++){
            if(i%a==0 && i>=a){
                System.out.print("*");
                System.out.println();
                
            }
            else{
                System.out.print("*");
                
            }
        }
    }
}