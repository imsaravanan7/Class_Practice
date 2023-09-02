import java.util.*;

public class Dollar_to_INR{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float INR=81.78f;
        System.out.print("Enter a Dollar value : ");
        float Dollar=scan.nextFloat();

        float ans=Dollar*INR;
        System.out.println("Dollar converted to INR : "+ans);
    }
}