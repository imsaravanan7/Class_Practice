import java.util.*;

public class Fordiamond_number{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);

        System.out.print("Enter a Number : ");
        int number =scan.nextInt();

        for(int i=1; i<number; i++){
            for(int j=i; j<=number; j++){
                System.out.print(" ");
            }
            for(int k=i; k>1; k--){
                System.out.print(k);
            }
            for(int l=1;l<=i; l++){
                System.out.print(l);
            }
            System.out.print("\n");
        }
            for(int i=number; i>=1; i--){
            for(int j=i; j<=number; j++){
                System.out.print(" ");
            }
            for(int k=i; k>1; k--){
                System.out.print(k);
            }
            for(int l=1;l<=i; l++){
                System.out.print(l);
            }
            System.out.print("\n");
       }   
}
}
// output:
// Enter a Number : 5
//      1
//     212
//    32123
//   4321234
//  543212345
//   4321234
//    32123
//     212
//      1