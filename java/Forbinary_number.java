import java.util.*;

public class Forbinary_number{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);

        System.out.print("Enter a Number : ");
        int number=scan.nextInt();
        int c;

        for(int i=1; i<=number; i++){
            if(i%2==0){
                c=0;
                for(int j=1;j<=number; j++){
                //System.out.print(c);
                c = (c == 0)? 1 : 0;
                }
            }
            else{
                c=1;
                for(int j=1;j<=number; j++){
                //System.out.print(c);
                c = (c == 0)? 1 : 0;
                }
            }
            System.out.print("\n");
        }
        for(int i=1; i<=number; i++){
            for(int j=1; j<=)
        }
    }
}