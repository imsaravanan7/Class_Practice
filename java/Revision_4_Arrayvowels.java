import java.util.*;

public class Revision_4_Arrayvowels{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        char arr[]={'a','e','i','o','u','A','E','I','O','U'};

        System.out.print("Enter a Character : ");
        char word=scan.next().charAt(0);

        for(int a=0; a<arr.length; a++){
            if(arr[a]==word){
                System.out.print("The given Character is Vowel ");
                break;
            }
            else{
                System.out.print("The given Character is Consonant ");
                break;
            }
        }
    }
}