public class Array_Test2_reverse{
    public static void main(String args[]){
        int[] arr={4,5,1,8,3};
        int len=arr.length;
        int[] arr1=new int[len];

        for(int l=len-1; l>=0; l--){
            arr1[l]=arr[l];
        }
        for(int l=len-1; l>=0; l--){
            System.out.println(arr1[l]);
        }
    }
}