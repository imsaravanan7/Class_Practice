import java.util.Scanner;

class Calci{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int a;
        int b;
        
        String str="multiple";
        //   System.out.println("Enter your calc method 'add','sub','multiple','division' : ");
        // str=scan.nextLine();

        System.out.print("Enter value of A : ");
        a=scan.nextInt();
        
        System.out.print("Enter value of B : ");
        b=scan.nextInt();
        
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;

      
      

        if(str=="add"||str=="ADD"){
            System.out.print("The sum of a&b is :"+c);
        }
        else if(str=="sub"||str=="SUB"){
            System.out.print("The subraction of a&b is :"+d);
        }
        else if(str=="multiple"||str=="Multiple"){
            System.out.print("The multiple of a&b is :"+e);
        }
        else if(str=="division"||str=="DIVISION"){
            System.out.print("The division of a&b is :"+f);
        }
        else{
            System.out.println("Enter a correct method for calculate 're enter'");
        }
    }
}