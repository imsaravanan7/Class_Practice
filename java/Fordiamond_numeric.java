import java.util.*;

public class Fordiamond_numeric{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a NUmber :");
        int number=scan.nextInt();

        for(int i=1; i<=number; i++){
            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }
            for(int j=i; j<=number; j++){
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }
    }
}