import java.util.*;

public class Forspace_triangle{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int star=scan.nextInt();

        for(int i=1; i<=star; i++){
            for(int j=i; j<=star; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                if(k==1){
                    System.out.print("*");
                }
                else if(i==star){
                    System.out.print("+");
                }
                else if(k==i*2-1){
                    System.out.print("-");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
// output:
//      *
//     * *
//    *   *
//   *     *
//  *********  
