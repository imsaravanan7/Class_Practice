public class String_codePoint_Functions{      //codePointAt(n),codePointBefore(n-1),codePointCount(0,n),
    public static void main(String args[]){
        String word="saravananz";
        int len=word.length();
        int result=word.codePointCount(0,len);
        System.out.print(result);
    }
}
    // A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;     A=65,...90;     a=97,...122;