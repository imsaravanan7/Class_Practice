import java.util.*;

public class Functions_pattern{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter a Number : ");
        int num=scan.nextInt();
       pattern(num);
    }
    public int void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        return 
    }
}