import java.util.*;

public class ForLeft_triangle{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Numbber : ");
        int num=scan.nextInt();

        for(int i=num; i>=1; i--){
            for(int j=i; j>1; j--){
                System.out.print(" ");
            }
            for(int k=i; k<=num; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}