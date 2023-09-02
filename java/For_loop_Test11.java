import java.util.*;     //Find positive,negative or Zero

public class For_loop_Test11{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
       
        int num1=0;
        int num2=0;
        int num3=0;
        char choice;
        choice=scan.next().charAt(0);

        for(;choice=='y'||choice=='Y';){  
            System.out.print("Enter a Number you Want : ");
            int num=scan.nextInt();   
            if(num>0){
                    num1++;
            }
            else if(num<0){
                num2++;
            }
            else{
                num3++;
            }
            System.out.print("Do you want to continue y/n? ");
            choice=scan.next().charAt(0);
        }

    System.out.println("The Given Number is Positive "+num1);
    System.out.println("The Given Number is Negative "+num2);
    System.out.println("The Given Number is Zero "+num3);
    }
} 