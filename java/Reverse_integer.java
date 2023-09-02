public class Reverse_integer{
    public static void main(String args[]){
        int a=1982635;
        int b=0;
        int c=0;

        for(;a!=0; a=a/10){
            b=a%10;
            c=c*10+b;
        }
        System.out.print(c);
    }
}
// class Solution {
//     public int reverse(int x) {
//         int a=0; 
//         long rev=0;

//         for(; x!=0; x=x/10){
//             a=x%10;
//             rev=rev*10+a;
//         }
//         if(rev>2147483647 || rev<-2147483647 ){
//             return 0;
//         }
//         return (int)rev;
//     }
// }