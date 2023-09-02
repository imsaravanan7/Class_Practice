public class Lc_plusOne_66{
    public static void main(String args[]){
        int[] arr={9};
        int len=arr.length;
        for(int a=0; a<len; a++){
            if(arr[len-1]==9){
                arr[len-1]=1;
                for(int i=0; i<len+1; i++){
                }
                break;

                //arr[a]=arr[len-1];
            }
            else if(arr[a]==arr[len-1]){
                arr[a]=arr[len-1]+1;
            }
            
            // System.out.println(arr[a]);
        }
        for(int a=0; a<len+1; a++){
            System.out.println(arr[a]);
        }
    }
}