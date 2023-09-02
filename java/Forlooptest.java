import java.util.*;

public class Forlooptest{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        int a;
        System.out.print("Enter the number : ");
        a=scan.nextInt();
        long c=0;
        for(int i=1;i<=a;i++){  
            c+=i;   
        }
         System.out.println(c);
    }
}
// public class squarePattern {
//   public static void main(String[] args) {

//     // size of the square
//     int size = 5;
//     // outer loop
    
//       // inner loop
      
        
//   }
// }