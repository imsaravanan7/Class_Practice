import java.util.Scanner;

class Testif3{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
         int a;

        System.out.print("Enter The Age : ");
         a=val.nextInt();
         //if(a%2==0){
        //     System.out.println("The Given Num is Even");
        //  }
        //  else{
        //     System.out.println("The Given Num is Odd");

        //  }
        if(a>=18){
            System.out.println("Major");
        }
        else{
            System.out.println("Miner");

        }
    }
}