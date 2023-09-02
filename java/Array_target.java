import java.util.*;
public class Array_target{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num[]=new int[10];
        
        for(int i=0;i<10;i++){
        num[i]=s.nextInt();
        }
        int leng=num.length;

        int target=20;
        for(int i=0; i<leng; i++){
            for(int j=i+1;j<leng;j++){

        
            if(num[i]+num[j]==target){
              
        System.out.print("The Index values of target :");
        System.out.println(i);
        System.out.println(j);
            }
        }   
        }   
            }
}
