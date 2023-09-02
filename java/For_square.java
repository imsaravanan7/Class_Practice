import java.util.*;

public class For_square{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int star=scan.nextInt();

        for(int i=1; i<=star; i++){
            for(int j=1; j<=star; j++){
                if(i==1 || i==star || j==1 || j==star){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}