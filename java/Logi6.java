import java.util.Scanner;

class Logi6{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        int a;

        System.out.print("Enter Ur Mark : ");
        a=val.nextInt();

        if(a<=100 && a>=90){
            System.out.print("Your Grade is 'A'");
        }
        
        else if(a<90 && a>=80){
            System.out.print("Your Grade is 'B'");
        }

        
        else if(a<80 && a>=70){
            System.out.print("Your Grade is 'C'");
        }

        
        else if(a<70 && a>=60){
            System.out.print("Your Grade is 'D'");
        }

        
        else if(a<60 && a>=50){
            System.out.print("Your Grade is 'E'");
        }
        else{
            System.out.print("fail");
        }
    }
}