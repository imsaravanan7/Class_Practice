import java.util.*; //http://www.beginwithjava.com/java/loops/questions.html

public class For_loop_Test1{
    public static void main(String args[]){
        Scanner scan= new Scanner (System.in);
        System.out.print("Enter a Number : ");
        int num=scan.nextInt();

        for(int i=1; i<=num; i++){
            System.out.print("\n"+i);
        }
    }
}