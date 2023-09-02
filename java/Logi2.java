import java.util.Scanner;

class Logi2{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        char a1;

        // System.out.print("Enter a char : ");
        // a1=val.next().charAt(0);

        if(a1=='a'||a1=='e'||a1=='i'||a1=='o'||a1=='u'){
            System.out.print("The given word is vowel");
        }
        else if(a1=='A'||a1=='E'||a1=='I'||a1=='O'||a1=='U'){
            System.out.print("The given word is vowel");
        }
        
        
        else{
            System.out.print("The given word is not a vowel");
        }

    }
}