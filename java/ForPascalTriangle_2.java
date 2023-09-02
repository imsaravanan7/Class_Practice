import java.util.*;

public class ForPascalTriangle_2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num=scan.nextInt();
        for(int a=1; a<=num; a++){
            for(int b=a; b<=num; b++){
                System.out.print(" ");
            }
            int k=1;
            for(int c=1; c<=a; c++){
                System.out.print(" "+k);
                k=k*(a-c)/c;
            }
        System.out.println();
        }
    }
}