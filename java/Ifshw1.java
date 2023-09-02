import java.util.Scanner;

class Ifshw1{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int a;
        int b;

        System.out.print("Enter the Num : ");
        a=scan.nextInt();
        System.out.print("Enter the Num : ");
         b=scan.nextInt();

        if(a%b==1){
            System.out.println("The given number remainder is 1");
        }
        else{
            System.out.println("The given number remainder is 0");
        }
        
    }
}