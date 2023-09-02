import java.util.*;

public class Forsand_clock{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int star=scan.nextInt();

        for(int i=star; i>=1; i--){
            for(int j=i-1; j<=star; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=star; i++){
            for(int j=i-1; j<=star; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}