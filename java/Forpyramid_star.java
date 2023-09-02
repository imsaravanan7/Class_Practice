import java.util.*;

public class Forpyramid_star{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a NUmber : ");
        int star=scan.nextInt();

        for(int i=1; i<=star; i++){
            // int c=i%2;
            for(int j=i-1; j<=star; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}