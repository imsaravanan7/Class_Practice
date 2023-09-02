import java.util.Scanner;       //Find HCF 

public class For_loop_Test9{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a 1st Number : ");
        int dividend=scan.nextInt();
        System.out.print("Enter a 2nd Number : ");
        int divisor=scan.nextInt();
        
        int remain=0;
        int hcf=0;

        do{
            remain=dividend%divisor;
            if(remain==0){
                hcf=divisor;
            }
            else{
                dividend=divisor;
                divisor=remain;
            }
        }
        while(remain!=0);
    System.out.print("hcf : "+hcf);
    }
}