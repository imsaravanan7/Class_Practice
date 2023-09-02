// import java.util.*;

// public class Reverse{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter a Word : ");
//         String name=scan.nextLine();
//         StringBuilder word=new StringBuilder(name);

//         word.reverse();
//         System.out.print(word.toString());
        
//     }
// }


import java.util.*;

public class Reverse{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a Word : ");
        String name=scan.nextLine();
        String reversed="";

        for(int i=name.length()-1; i>=0; i--){
        reversed +=name.charAt(i);
        }
        System.out.println(reversed);
        if(name==reversed){
            System.out.println("The given word is palindrome ");
        }
        else{
            System.out.println("The given word is Not a palindrome ");
        }
    }
}