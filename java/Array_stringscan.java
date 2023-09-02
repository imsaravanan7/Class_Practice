import java.util.*;

public class Array_stringscan{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        String word[]=new String[5];
        System.out.println("Enter ur Names : ");
        for(int i=0; i<word.length; i++){
            
            word[i]=scan.nextLine();
        }
        for(int i=0; i<word.length; i++){
            System.out.print(word[i]+"  ");
        }
    }
}