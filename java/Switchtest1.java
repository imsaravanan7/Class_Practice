import java.util.*;

public class Switchtest1{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        String name;
        System.out.print("Enter Your Name(CAPS) : ");
        name=val.nextLine();

        switch(name){
            case "SARAVANAN":
                System.out.println("saravanan123@gmail.com");
                System.out.println("RVSCAS");
                System.out.println("8012341234");
                break;
            case "ASHIF":
                System.out.println("ashif123@gmail.com");
                System.out.println("RCAS");
                System.out.println("8012341234");
                break;
            case "VISHNU":
                System.out.println("vishnu123@gmail.com");
                System.out.println("HiCAS");
                System.out.println("8012341234");
                break;
            case "SANTHOSH":
                System.out.println("santhosh123@gmail.com");
                System.out.println("PSGCAS");
                System.out.println("8012341234");
                break;
                default:
                    System.out.print("Your name not in LIst");
                    
        }
    }
}