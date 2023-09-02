import java.util.*;

public class Forzero_ones{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a NUmber : ");
        int number=scan.nextInt();
        int num;

        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                if(j%2==0){
                    num=0;
                    System.out.print(num);
                }
                else{
                    num=1;
                    System.out.print(num);
                }

            }
            System.out.print("\n");
        }
    }
}