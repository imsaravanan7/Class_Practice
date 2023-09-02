public class Revision_1{    //implisit explisit
    public static void main(String args[]){
        int a=10;
        float f=10f;
        a=(int)f;
        f=a;
        System.out.println(a);
        System.out.println(f);
    }
}