import java.util.*;     //Odd Or Even find in do while loop

public class For_loop_Test7{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num=scan.nextInt();
        int evenNum=0;
        int oddNum=0;
        char choice;

        do{
            if(num%2==0){
                evenNum += num;
            }
            else{
                oddNum +=num;
            }
            System.out.print("Do you want to continue ");
            choice=scan.next().charAt(0);
        }
            while(choice=='y'|| choice=='Y');
            System.out.print("The given num is Even "+ evenNum);
            System.out.print("The given num is Odd "+ oddNum);
        }
    }
