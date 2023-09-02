import java.util.*;

public class Roman_intsplit{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Roman : ");
        String str=scan.nextLine();
        String splt[]=str.split("");
        int ans=0;
        for(int i=splt.length-1; i>=0; i--){
            int num=0;
            switch(splt[i]){
                case "I":
                    num=1;
                    break;
                case "V":
                   num=5;
                    break;
                case "X":
                    num=10;
                    break;
                case "L":
                    num=50;
                    break;
                case "C":
                    num=100;
                    break;
                case "D":
                    num=500;
                    break;
                case "M":
                    num=1000;
                    break;                
            }
            if(ans<=num){
                ans=ans+num;
            }
            else{
                ans=ans-num;
            }
        }
        System.out.print(ans);

    }
}