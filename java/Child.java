import java.util.Scanner;

public class Child{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        Double child;
        Double Himo;
        Double mnth=0.0833;

        System.out.print("Enter Your Child Age(month) : ");
        child=val.nextDouble();
        System.out.println("This is Your Child age : "+child +" Month");


        System.out.print("Enter Your Himo level : ");
        Himo=val.nextDouble();
        

        if(child*mnth<=0.0833){
            if(Himo>=10. && 20.0>=Himo){
                System.out.print("Your child himo level is Normal");
            }
            else{
                System.out.print("Your child himo level is Abnormal");
            }
        }
        else if(child*mnth>0.0833 && child*mnth<=2*0.0833){
            if(Himo>=10.0 && 18.0>=Himo){
                System.out.print("Your child himo level is Normal");
            }
            else{
                System.out.print("Your child himo level is Abnormal");
            }
        }
        else if(child*mnth>2*0.0833 && child*mnth<=6*0.0833){
            if(Himo>=9.5 && 14.0>=Himo){
                System.out.print("Your child himo level is Normal");
            }
            else{
                System.out.print("Your child himo level is Abnormal");
            }
        }
        else if(child*mnth>6*0.0833 && child*mnth<=24*0.0833){
            if(Himo>=10.5 && 13.5>=Himo){
                System.out.print("Your child himo level is Normal");
            }
            else{
                System.out.print("Your child himo level is Abnormal");
            }
        }
        else if(child*mnth>24*0.0833 && child*mnth<=72*0.0833){
            if(Himo>=11.5 && 13.5>=Himo){
                System.out.print("Your child himo level is Normal");
            }
            else{
                System.out.print("Your child himo level is Abnormal");
            }
        }
        else if(child*mnth>72*0.0833 && child*mnth<=144*0.0833){
            if(Himo>=10.0 && 18.0>=Himo){
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
