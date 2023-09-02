import java.util.*;

public class Genswitch{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a word : ");
        String gen=scan.nextLine();

        switch(gen){
            case "m":
            case "M":
            System.out.print("Male");
            break;
            case "f":
            case "F":
            System.out.print("Female");
            break;
            default:
                System.out.print("Null");
        }
        
    }
}