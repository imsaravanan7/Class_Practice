import java.util.*;

public class Forsand_clock1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num=scan.nextInt();

        for(int i=num; i>=1; i--){
            for(int j=i-1; j<=num; j++){
                System.out.print(" ");
            }
            for(int k=i; k>1; k--){
                System.out.print(k);
            }
            for(int l=1; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
        for(int i=2; i<=num; i++){
            for(int j=i-1; j<=num; j++){
                System.out.print(" ");
            }
            for(int k=i; k>1; k--){
                System.out.print(k);
            }
            for(int l=1; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }

}