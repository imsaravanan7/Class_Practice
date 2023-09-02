import java.util.*;

public class Arrayscan{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a numbers : ");
        int num[]=new int[10];
        

        for(int i=0; i<10; i++){
            num[i]=scan.nextInt();
        }
        for(int i=0; i<10; i++){
            System.out.print(num[i]+"   ");
        }
        int lens=num.length;
                if(lens%2==1){
                    System.out.println(" "+lens/2);
                }
                else{
                    int a=lens/2;
                    int b=a-1;
                    float c=((float)(num[a]+num[b])/2);
                    System.out.print(c);
                }
            
        }
    }
