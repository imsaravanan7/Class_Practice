import java.util.*;

public class Functions_return{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number1 : ");
        int num=scan.nextInt();
        System.out.print("Enter a Number2 : ");
        int num1=scan.nextInt();
        
        System.out.println("Sum of : " + add(num,num1));
    }
    public static int add(int n,int n2){
        return n+n2;
    }
}