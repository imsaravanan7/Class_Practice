import java.util.*;

class Forrightrian_pascal{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num=scan.nextInt();

        for(int i=num; i>=1; i--){
            for(int j=i; j<=num; j++){
                System.out.print(" "+"*");
            }
            System.out.print("\n");
        }
        for(int i=2; i<=num; i++){
            for(int j=i; j<=num; j++){
                System.out.print(" "+"*");
            }
            System.out.print("\n");
        }
    }

}
//output:
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *