import java.util.*;

public class Lc_Valid_Parenthesisi_20{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        String bracket=scan.nextLine();
        String str="()";
        String str1="{}";
        String str3="[]";
        if(str.equals(bracket)||str1.equals(bracket)||str3.equals(bracket)){
            System.out.print(true);
        }
        else if(str1.equals(bracket)){
            System.out.print(true);
        }
        else if(str3.equals(bracket)){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}