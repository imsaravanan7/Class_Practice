import java.util.*;

public class Forpyramid_star1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int star=scan.nextInt();
        // int i=star;
        for(int i=star; i>=1; i--){
            for(int j=i; j<=star; j++){
                System.out.print(" ");

            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// output:
//  *********
//   *******
//    *****
//     ***
//      *