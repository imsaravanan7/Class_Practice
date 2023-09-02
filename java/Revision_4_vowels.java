import java.util.*;

public class Revision_4_vowels{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);

        System.out.print("Enter a Character : ");
        char word=scan.next().charAt(0);
        char val=word.toLowerCase();
        System.out.print(val);

        // if(word.isLowerCase()=='a'||word=='e'||word=='i'||word=='o'||word=='u'){
        //     System.out.print("The given character is Vowel");
        // }
        // else if(word=='A'||word=='E'||word=='I'||word=='O'||word=='U'){
        //     System.out.print("The given character is Vowel");
        // }
        // else{
        //     System.out.print("The Given character is Consonant");
        // }
    }
}