import java.util.*;
public class switch1{
    public static void main(String [] args){
        Scanner name=new Scanner(System.in);
        String name1=name.nextLine();
        switch(name1){
            case "add":
                int num1=name.nextInt();
                int num2=name.nextInt();
                System.out.println("your name is :"+(num1+num2));
                break;
                   case "raja":
                System.out.println("your name is :"+name1);
                break;
                   case "suresh":
                System.out.println("your name is :"+name1);
                break;
                   case "ajith":
                System.out.println("your name is :"+name1);
                break;
                default:
                    System.out.println("unknown");
        }
    }
    
}