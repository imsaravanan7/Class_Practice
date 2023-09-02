import java.util.*;

public class Array_string{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
       
        
        String word[]=new String[5];
         for(int i=0; i<word.length;i++){
              word[i]=scan.nextLine();
           
         }
        for(int i=0; i<word.length;i++){
            System.out.print(word[i]+"  ");
           
         }
    }
}