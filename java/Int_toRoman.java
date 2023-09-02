import java.util.*;

public class Roman_intsplit{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Roman : ");
        int num=scan.nextInt();
        String ans;
            String num1;
            switch(num){
                case 1:
                    num1="I";
                    break;
                case 4:
                   num1="IV";
                    break;
                case 5:
                   num1="V";
                    break;
                case 9:
                    num1="IV";
                    break;
                case 10:
                    num1="X";
                    break;
                case 50:
                    num1="L";
                    break;
                case 100:
                    num1="C";
                    break;
                case 500:
                    num1="D";
                    break;
                case 1000:
                    num1="M";
                    break;
        }
        System.out.print(num1);

    }
    }
