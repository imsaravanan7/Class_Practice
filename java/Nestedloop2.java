import java.util.*;

public class Nestedloop1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a NUmber : ");
        int star=scan.nextInt();
        int c;

        for(int i=1; i<=star; i++){
            c=1;
            for(int k=i;k<=star; k++){
                System.out.print(" ");
                
            }
            for(int j=1; j<=i; j++){
               
                    System.out.print(" "+c);
                    c=c*(i-j)/j;
                }
            System.out.print("\n");
        }
        }
    }
