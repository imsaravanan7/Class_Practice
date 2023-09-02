public class palindrome_num{
    public static void main(String args[]){
        int a=123454321;
        int x=a;
        int b=0;
        int c=0;

        for(;a!=0; a=a/10){
            b=a%10;
            c=c*10+b;
        }
        if(x>0){
        if(x==c){
            System.out.print(true);
        }
        }
        else{
        System.out.print(false);
        }
}
}