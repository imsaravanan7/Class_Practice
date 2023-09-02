import java.util.*;

public class Fornumber_pattern{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);

        System.out.print("Enter a Number : ");
        int number=scan.nextInt();
        int k=1;
        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k++);
            }
            System.out.print("\n");
        }
    }
}