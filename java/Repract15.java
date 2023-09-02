import java.util.*;

public class Repract15{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a CHARACTER : ");
        char a=scan.next().charAt(0);

        if('a'<=a && 'z'>=a || 'A'<=a && 'Z'>=a ){
            System.out.print("The given Char is 'Alphabetic'");
        }
        else if(a>='0' && a<='9'){
            System.out.print("The given Char is 'Number' ");
        }
        else{
            System.out.print("The given Char is 'Special Character'");
        }
    }
}