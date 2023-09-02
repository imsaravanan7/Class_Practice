import java.util.*;

public class Array_targetscan{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int num[]=new int[10];
        int target=20;
        for(int i=0; i<10; i++){
            num[i]=scan.nextInt();
        }
        int leng=num.length;
        for(int i=0; i<leng; i++){
            for(int j=i+1; j<leng; j++){
                if(num[i]+num[j]==target){
                    System.out.println("The Two index numbers ");
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}