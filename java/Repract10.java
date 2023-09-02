import java.util.*;

class repract10{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        
        System.out.print("Enter ur num A : ");
        int a=scan.nextInt();

        System.out.print("Enter ur num B : ");
        int b=scan.nextInt();

        if(a>b){
            System.out.print("A is Greater than B");
        }
        else if(b>a){
            System.out.print("B is Greater than A");
        }
        else{
            System.out.print("Equal");
        }
    }
}