public class Functions_arraysort{
    public static void main(String args[]){
        int arr[]={14,24,3,8,1,10,0};
      
        
       int arr1[] =decending(arr);
       for(int i=0; i<arr1.length; i++){
        System.out.println(arr1[i]);
       }
    }
    public static int[] decending(int[] arr){
          int len=arr.length;
          int temp=0;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
        return arr;
    }
}