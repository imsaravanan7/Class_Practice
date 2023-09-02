import java.util.*;
public class Collections_List_Medhod_2{
    public static void main(String args[]){
        ArrayList<String> str=new ArrayList<String>();
        str.add("TAmil");
        str.add("English");
        str.add("MAth");
        str.add("Science");
        for(String a:str){
            System.out.println(a);
        }
        System.out.println(str.clone());
        
        System.out.println(str.size());
        
        //  System.out.println(str.trimToSize());
    }
}