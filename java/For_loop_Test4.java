import java.util.*; //Factorial number

public class For_loop_Test4{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scan.nextInt();
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact *=i;

        }

        System.out.print("The factorial num is : "+fact);
    }
}