import java.util.*;

public class Nestedloop1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a NUmber : ");
        int star=scan.nextInt();

        for(int i=1; i<=star; i++){
            for(int j=star; j>=i; j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}