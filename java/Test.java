public class Test{ 
    public static void main(String args[]){
        int a=-654;
        int b=a%10;
        int c=a/10%10;
        int d=a/100;
        int e=b*100+c*10+d;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
    }
}