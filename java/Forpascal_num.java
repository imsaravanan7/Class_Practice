import java.util.*;

public class Forpascal_num{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number=scan.nextInt();

        for(int i=1; i<=number; i++){
            int c=1;
            for(int k=i; k<=number; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" "+c);
                c=c*(i-j)/j;
            }
            System.out.println();
        }
    }
}