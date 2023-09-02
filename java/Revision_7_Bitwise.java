public class Revision_7_Bitwise{
    public static void main(String args[]){
        int a=6&5;      //5=32 16 8 4 2 1
        int b=5|6;      //5=0  1  0 1 0 0;
        int c=5^6;
        int d=4>>1;
        int e=5<<2;
        int num=14526735;
        // int val=0x101; 
        // int val=0b101;
        // int val=0101;
        int val=0101;     //converted a byte to binary,octal,decimal,hexadecimal
        String word=Integer.toBinaryString(num);
        // System.out.println(word);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        System.out.println(d);
        // System.out.println(e);
    }
}