import java.util.Scanner;

class Logi3{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        String a1;

        System.out.print("Enter a char : ");
        a1=val.nextLine();

        if(a1=="a"||a1=="e"||a1=="i"||a1=="o"||a1=="u"){
            System.out.print("The given word is vowel");
        }

        
        else{
            System.out.print("The given word is not a vowel");
        }

    }
}