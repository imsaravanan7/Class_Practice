import java.util.*;

public class Fordown_triangle{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int star=scan.nextInt();

        for(int i=star; i>=1; i--){
            for(int j=i; j<=star; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}