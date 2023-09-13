public class Zoho_Ques_6{
    public static void main(String args[]){
        String str="hello Saravanan How Are You";

        String str2[]=str.split(" ");
        for(int a=str2.length-1; a>=0; a--){
        System.out.print(str2[a]+" ");
        }
    }
}