import java.util.*;

public class Array_Function_2_avg{
    public static void main(String args[]){
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a 1St Number : ");
        float num1=Scan.nextFloat();
        System.out.print("Enter a2nd Number : ");
        float num2=Scan.nextFloat();
        System.out.print("Enter a 3rd Number : ");
        float num3=Scan.nextFloat();
        float avg=compute(num1,num2,num3);
        System.out.print("The avg of given number is :"+avg);
    }
    public static float compute(float a,float b,float c){
        return (a+b+c)/3;
    }
}