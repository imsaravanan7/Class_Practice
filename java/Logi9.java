import java.util.Scanner;

class Logi9{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        char a;
        
        System.out.print("Enter a Character : ");
        a=val.next().charAt(0);

        
        if(a>='a' && a<='z'){
            System.out.print("The given char Is 'Alphabetic'");
        }
        
        else if(a>='A' && a<='Z'){
            System.out.print("The given char Is 'Alphabetic'");
        }
        else if(a<='9' && a>='0'){
            System.out.print("The given char is 'Number'");
        }
        else{
            System.out.print("The give char is 'Special Character'");
        }
    }
}