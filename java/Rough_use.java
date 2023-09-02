import java.util.*;
public class Rough_use{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Phone Number : ");
        String str=scan.nextLine();
        
    char[] hide=str.toCharArray();
    System.out.print("After change : ");
    for(int j=0; j<hide.length-3; j++){
        hide[j]='*';
    }
    for(int i=0; i<hide.length; i++){
        System.out.print(hide[i]);
    }
    }
    }
