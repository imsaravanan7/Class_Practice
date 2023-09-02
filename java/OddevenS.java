import java.util.*;

public class OddevenS{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int name=scan.nextInt();

        switch(name){
            case 1:
                System.out.print("The month is 'January'");
                break;
            case 2:
                System.out.print("The month is 'Febrary'");
                break;
            case 3:
                System.out.print("The month is 'March'");
                break;
            case 4:
                System.out.print("The month is 'April'");
                break;
            case 5:
                System.out.print("The month is 'May'");
                break;
            case 6:
                System.out.print("The month is 'June'");
                break;
            case 7:
                System.out.print("The month is 'July'");
                break;
            case 8:
                System.out.print("The month is 'August'");
                break;
            case 9:
                System.out.print("The month is 'September'");
                break;
            case 10:
                System.out.print("The month is 'October'");
                break;
            case 11:
                System.out.print("The month is 'November'");
                break;
            case 12:
                System.out.print("The month is 'Decmber'");
                break;
            default :
            System.out.print("Enter the number(1-12)");

            

        }
    }
}