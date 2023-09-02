import java.util.*;

public class Forright_trianglenum{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number =scan.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
// output:
// Enter a Number : 5
// 1
// 21
// 321
// 4321
// 54321