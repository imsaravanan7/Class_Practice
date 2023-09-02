import java.util.*;     //Fibonnacci Series

public class For_loop_Test14{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scan.nextInt();
        int num1=0;
        int num2=1;
        int num3;

        for(int i=0; i<num; i++){
            num3=num1+num2;
            System.out.print(num3+",");
            num1=num2;
            num2=num3;
        }
        
    }
}