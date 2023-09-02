import java.util.Scanner;

public class Himo{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        String cat;
        int child;
        int male;
        int female;
        double hl;
        //month is converted to year
        double mnth=0.083;

        System.out.print("Enter your category 'male','female' : ");
        cat="c";
 
        if(cat=="f" || cat=="F"){
           
            System.out.print("Enter your Age : ");
            female=val.nextInt();
        
            System.out.print("Enter your Himo Level : ");
            hl=val.nextDouble();
        
            if(12<=female && female<=18 && 12.0<=hl && hl<=16.0){
                System.out.println("Your Himo Level is Normal");
            }
            else if(female>18 && 12.1<=hl && hl<=15.1){
                System.out.println("Your Himo Level is Normal");
            }
            else{
                System.out.println("Your Himo Level is AbNormal");
            }
        }
        else if(cat=="m" || cat=="M"){
        
            System.out.print("Enter your Age : ");
            male=val.nextInt();
        
            System.out.print("Enter your Himo Level : ");
            hl=val.nextDouble();
        
            if(12<=male && male<=18 && 13.0<=hl && hl<=16.0){
                System.out.println("Your Himo Level is Normal");
            }
            else if(male>18 && 13.6<=hl && hl<=17.7){
                System.out.println("Your Himo Level is Normal");
            }
            else{
                System.out.println("Your Himo Level is AbNormal");
            }
        }
        else if(cat=="c"||cat=="C"){
            System.out.print("Enter your Age(month) : ");
            child=val.nextInt();
            System.out.println("This is Your Child age : "+child +" Month");
        
            System.out.print("Enter your Himo Level : ");
            hl=val.nextDouble();

            if(child<=1 && hl>=10.0 && 20.0>=hl){
                System.out.print("Your child himo level is Normal");
            }
            else if(child>1 && child<=2 && hl>=10.0 && 18.0>=hl){
                System.out.print("Your child himo level is Normal");
            }
            else if(child>2 && child<=6 && hl>=9.5 && 14.0>=hl){
                System.out.print("Your child himo level is Normal");
            }
            else if(child>6 && child<=24 && hl>=10.5 && 13.5>=hl){
                System.out.print("Your child himo level is Normal");
            }
            else if(child>24 && child<=72 && hl>=11.5 && 13.5>=hl){
                System.out.print("Your child himo level is Normal");
            }
            else if(child>72 && child<=144 && hl>=10.0 && 18.0>=hl){
                System.out.print("Your child himo level is Normal");
            }
            else{
                System.out.print("Your child himo level is Abnormal");
            }
        }
        else{
            System.out.print("Enter your child age with calculate the month");
        }
        
    }
}