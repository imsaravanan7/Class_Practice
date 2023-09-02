import java.util.*;

public class For_loop_Test15{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);

        System.out.print("Enter a Number : ");
        int num=scan.nextInt();
        float sum=0f;

        for(int loop=1; loop<=num; loop++){
            sum +=1.0f/loop;
        
        }
        System.out.print("The sum of : "+sum);
    }
}