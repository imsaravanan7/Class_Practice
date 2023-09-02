import java.util.*;

public class Fordecending_number{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = scan.nextInt();

        for(int i=number; i>=1; i--){
            for(int j=number; j>=i; j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
// output:
// Enter a Number : 5
// 5
// 54
// 543
// 5432
// 54321