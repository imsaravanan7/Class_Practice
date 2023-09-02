import java.util.*;     //find prime num or non-prime numbers

public class For_loop_Test8{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Positive Number : ");
        int number=scan.nextInt();

        if(number%2!=0&&number%3!=0){
            System.out.print("The Given Number is Prime Number ");
        }
        else{
            System.out.print("The Given Number is Not a Prime Number ");
        }
    }
}