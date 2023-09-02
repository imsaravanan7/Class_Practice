import java.util.*;

public class Forstar{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);

    System.out.print("Enter a NUmber : ");
    int star=scan.nextInt();

    for(int i=1; i<=star*star; i++){
        if(i%star==0 && i>=star){
            System.out.print("*");
            System.out.println();
        }
        else{
            System.out.print("*");
        }
    }
    }
}