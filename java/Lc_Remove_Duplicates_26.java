public class Lc_Remove_Duplicates_26{
    public static void main(String args[]){
        int[] arr={0,1,2,2,3,3,4,4,4};
        int len=arr.length;

        for(int a=0; a<len; a++){
            for(int b=a+1; b<len; b++){
                if(arr[a]==arr[b]){
                    System.out.println('_');
                }
            }
        }
    }
}