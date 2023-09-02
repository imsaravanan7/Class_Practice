import java.util.Scanner;

public class Logi8{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int a;
        System.out.print("Enter The Number : ");
        a=scan.nextInt();

        if(!(a%5==0)){
            System.out.print("The number is Multiple ");
        }
        else{
            System.out.print("The number is not Multi of 5");
        }

    }
}