import java.util.*;

public class Zoho_Ques_2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num[]={1,4,6,8,2,9,5,10};
        int num1[]=new int[num.length];
        int num2[]=new int[num.length];
        int c=0;
        for(int i=0; i<num.length; i++){
            if(num[i]%2==0){
                num1[i]=num[i];
                for(int a=0; a<num1.length; a++){
                    for(int b=a; b<num1.length; b++){
                        if(num1[a]>num1[b]){
                            c=num1[a];
                            num1[a]=num1[b];
                            num1[b]=c;
                        }
                    }
                }
            }
            else{
            num2[i]=num[i];
                for(int a=0; a<num2.length; a++){
                    for(int b=a; b<num2.length; b++){
                        if(num2[a]<num2[b]){
                            c=num2[a];
                            num2[a]=num2[b];
                            num2[b]=c;
                        }
                    }
                }
            }
        }
        for(int a=0; a<num.length; a++){
            System.out.println(num1[a]);
            System.out.println(num2[a]);
        }
    }
}