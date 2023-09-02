//import java.util.*;
//564789;

public class Reverse_int{
    public static void main(String args[]){
        int num=99;
        int len=num.length();

        for(int i=1; i<num; i++){
            int a=num%len-2;
            System.out.print(a);
        }
    }
}
