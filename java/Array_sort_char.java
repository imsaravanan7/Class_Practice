import java.util.Arrays;

public class Array_sort_char{
    public static void main(String args[]){
        String arr[]={"dog","zero","one","two"};
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
        System.out.println(arr[i]);
        }
        // int len=arr.length;
        // String temp;

        // for(int i=0; i<len; i++){
        //     for(int j=i+1; j<len; j++){
        //         if(arr[i]>arr[j]){
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // for(int i=0; i<len; i++){
        //     System.out.println(arr[i]);
        // }
    }
}