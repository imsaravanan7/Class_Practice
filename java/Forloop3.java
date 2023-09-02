import java.util.*;

public class Forloop3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.print("Enter a number : ");
        a=scan.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println( i + "*"+a+"="+i*a);
        }
    }
}
