public class Lc_length_of_lastword_58{
    public static void main(String args[]){
        String str="How Are You? I'm Fineeuhh";
        int str2=str.lastIndexOf(" ");
        int len=(str.length())-1;
        System.out.print(len-str2);
    }
}