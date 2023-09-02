import java.util.*;     //trianary operators

public class Revision_6_trianary{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a NUmber : ");
        int num=scan.nextInt();

        String number =(num%2==0)?"EVEN":"ODD";
        System.out.print("The Given Number Is "+number);
    }
}