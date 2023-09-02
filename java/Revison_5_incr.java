public class Revison_5_incr{
    public static int a=1;
    public static void main(String args[]){
        int num=inc();
        System.out.println(num);
        System.out.println(a);
    }
    public static int inc(){
        return a++;
    }
}