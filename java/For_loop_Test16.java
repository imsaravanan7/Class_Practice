import java.util.*;

public class For_loop_Test16{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num=scan.nextInt();

        double sum=0;
        int a=1;

        for(int i=1; i<=num; i++){
            sum+=(1.0*a)/i;
            a*=-1;
        }
        System.out.println(sum);
    }
}