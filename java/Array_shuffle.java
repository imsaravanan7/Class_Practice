public class Array_shuffle{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length;
        int arr2[]=new int[len];
        int len2=arr2.length;
        int j=0;
        for(int i=0; i<len/2; i++){
            
            arr2[j]=arr[i];
            j++;
            arr2[j]=arr[i+5];
            j++;
            // System.out.println(arr2[j]);
            // for(int j=0; i<len2; j++){
            //     System.out.println(arr2[i]);
            // }
        }
         for(int i=0; i<len; i++){
         System.out.println(arr2[i]);
     }
}
}