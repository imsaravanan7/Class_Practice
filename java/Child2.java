import java.util.Scanner;

public class Child2{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);

        Double child;
        Double Himo;
        Double mnth=0.08333;
        String gen;
        
        System.out.print("Enter your category 'male','female','child : ");
        gen=val.nextLine();

        if(gen=="c"){

        System.out.print("Enter Your Child Age(month) : ");
        child=val.nextDouble();
        System.out.println("This is Your Child age : "+child*0.0833 +" Years");

        System.out.print("Enter Your Himo level : ");
        Himo=val.nextDouble();

            if(child*mnth<=1){
            }
            else if( Himo>=10.0 && 20.0>=Himo){
                System.out.print("Your child himo level is Normal");
            }
            else{
                System.out.print("Your child himo level is Abnormal");
            }
        }
        // else if(child*mnth>0.0833 && child*mnth<=2*0.0833){
        //     if(Himo>=10.0 && 18.0>=Himo){
        //         System.out.print("Your child himo level is Normal");
        //     }
        //     else{
        //         System.out.print("Your child himo level is Abnormal");
        //     }
        // }
        // else if(child*mnth>2*0.0833 && child*mnth<=6*0.0833){
        //     if(Himo>=9.5 && 14.0>=Himo){
        //         System.out.print("Your child himo level is Normal");
        //     }
        //     else{
        //         System.out.print("Your child himo level is Abnormal");
        //     }
        // }
        // else if(child*mnth>6*0.0833 && child*mnth<=24*0.0833){
        //     if(Himo>=10.5 && 13.5>=Himo){
        //         System.out.print("Your child himo level is Normal");
        //     }
        //     else{
        //         System.out.print("Your child himo level is Abnormal");
        //     }
        // }
        // else if(child*mnth>24*0.0833 && child*mnth<=72*0.0833){
        //     if(Himo>=11.5 && 13.5>=Himo){
        //         System.out.print("Your child himo level is Normal");
        //     }
        //     else{
        //         System.out.print("Your child himo level is Abnormal");
        //     }
        // }
        // else if(child*mnth>72*0.0833 && child*mnth<=144*0.0833){
        //     if(Himo>=10.0 && 18.0>=Himo){
        //         System.out.print("Your child himo level is Normal");
        //     }
        //     else{
        //         System.out.print("Your child himo level is Abnormal");
        //     }
        // }
        else{
            System.out.print("Enter your child age with calculate the month");
        }
    }
}
