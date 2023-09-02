import java.util.*;

public class For_diamond{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int star=scan.nextInt();

        for(int i=1; i<=star; i++){
            for(int j=i; j<=star; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=star-1; i>=1; i--){
            for(int j=i; j<=star; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}