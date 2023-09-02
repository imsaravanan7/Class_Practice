import java.util.*;

public class Revision_4_vowels2{
    public static void main(String args[]){
        String vowels="aeiouAEIOU";
        //vowels=vowels.toUpperCase();
        char letter;
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char word=scan.next().charAt(0);

        for(int a=0; a<vowels.length();a++){
            letter=vowels.charAt(a);
            System.out.println(letter);
            if(letter==word){
                System.out.print("The Given number is Vowels ");
                break;
            }
            else{
                System.out.print("The Given number is Consonant ");
                break;      
            }
        } 
        
    }
}