public class Sample{
    public static void main(String args[]){
        String alpha="742356";
        int len=alpha.length();
        int val[]=new int[len];
        for(int a=0; a<len; a++){
            char number=alpha.charAt(a);
            val[a]=Character.getNumericValue(number);
        }
        int temp=10;
        for(int a=0; a<len; a++){
            for(int b=a+1; b<len; b++){
                if(val[a]>val[b]){
                    temp=val[a];
                    val[a]=val[b];
                    val[b]=temp;
                }
            }
        }
        System.out.println(val[0]);
    }
}