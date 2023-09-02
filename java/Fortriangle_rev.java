import java.util.*;

public class Fortriangle_rev{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter a Number : ");
        int number=scan.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=i; j<=number; j++){
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