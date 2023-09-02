import java.util.*; //Table format

public class For_loop_Test3{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter a Number : ");
        int num=scan.nextInt();
        int multi=0;
        for(int i=1; i<=10; i++){
            multi=i*num;
        System.out.println(i+" x "+num+" = "+multi);
        }

    }
}