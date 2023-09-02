public class Lc_reverse_string_151{
    public static void main(String args[]){
        String str="My Name Is Saravanan";
        String str2[]=str.split(" ");
        for(int a=str2.length-1; a>=0; a--){
        System.out.print(str2[a]);
    }
    }
}