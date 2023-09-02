import java.util.*;

public class Forsimple_num{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number=scan.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
// output:
// Enter a Number : 5
// 1
// 12
// 123
// 1234
// 12345
