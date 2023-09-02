import java.util.*;
public class Collections_List_Medhod{
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(7);
        arr.add(0);

        // arr1.add(3);
        // arr1.add(4);
        // arr1.add(5);
        // arr1.add(6);
        // arr1.add(7);

        // arr.removeAll(arr1);
        // for(Integer a:arr){
        //     System.out.println(a);
        // }
        for(Integer a:arr){
            System.out.println(a);
        }
        System.out.println(arr.indexOf(5));
        
        System.out.println(arr.clone());
        
        System.out.println(arr.contains(1));

        System.out.println(arr.get(3));

        System.out.println(arr.isEmpty());
        arr.clear();
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
                System.out.println(it.next());
        }
         arr.add(0);
         for(Integer a:arr){
            System.out.println("Is Empty " + a);
        }
    }
}