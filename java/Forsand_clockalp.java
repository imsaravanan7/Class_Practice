import java.util.*;

public class Forsand_clockalp{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int alp=scan.nextInt();
        char c='@';
        // System.out.println(++c);
        for(int i=alp; i>=1; i--){
            for(int j=i; j<=alp; j++){
                System.out.print(" ");
                
            }
            for(int k=i; k>1; k--){
                System.out.print((char)(c+k));
            }
            for(int l=1; l<=i; l++){
                System.out.print((char)(c+l));
            }
            System.out.print("\n");
        }
        for(int i=2; i<=alp; i++){
            for(int j=i; j<=alp; j++){
                System.out.print(" ");
            }
            for(int k=i; k>1; k--){
                System.out.print((char)(c+k));
            }
            for(int l=1; l<=i; l++){
                System.out.print((char)(c+l));
            }
            System.out.print("\n");
        }
    }
}