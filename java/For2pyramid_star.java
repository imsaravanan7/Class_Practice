import java.util.*;

public class For2pyramid_star{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a NUmber : ");
        int star=scan.nextInt();

        for(int i=1; i<star; i++){
            int c=1;
            for(int j=i; j<=star; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" "+c);
                c=c*(i-k)/k;            //c=c*(i-k)/k; for pascal formula
            }
            System.out.println();
        }
        for(int a=star; a>=1; a--){
            int d=1;
            for(int b=a; b<=star; b++){
                System.out.print(" ");
            }
            for(int c=1; c<=a; c++){
                System.out.print(" "+d);
                d=d*(a-c)/c;
            }
            System.out.println();
        }
    }
}