import java.util.*; //Sum of Two Numbers

public class For_loop_Test2{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a number : ");
        Long num=scan.nextLong();
        int number=0;

        for(int i=1; i<=num; i++){
            number+=i;
        }
        System.out.print("The sum of num is :"+number);
    }
}