public class Leet_Code_Pract{
    public static void main(String args[]){
        int n=10;
        String word[]=new String[n+1];
        int num[]=new int[n+1];
        int nums=10;
        for(int a=0; a<=n; a++){
            num[a]=a;
        }
        for(int b=0; b<num.length; b++){
        word[b]=Integer.toBinaryString(num[b]);
        }
        for(int c=0; c<word.length; c++){
            System.out.println(word[c]);
        }
    }
}
