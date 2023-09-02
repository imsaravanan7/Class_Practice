import java.util.Scanner;       //if condition ==

class Testif1{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        int a;

        a=val.nextInt();

        if (a==1){
            System.out.println("Monday");
        }
        if (a==2){
            System.out.println("Tuesday");
        }   
        if (a==3){
            System.out.println("Wednesday");
        } 
        if (a==4){
            System.out.println("Thursday");
        }
        if (a==5){
            System.out.println("Friday");
        }
        if (a==6){
            System.out.println("Saturday");
        }
        if (a==7){
            System.out.println("Sunday");
        }
    }
    
}