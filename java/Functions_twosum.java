public class Functions_twosum{
    public static void main(String [ ] args){
        int arr[]={14,3,67,9,23,10,25};
        int target=28;
        int arr2[]=twosum(arr,target);
        System.out.println(arr2[0]+ " " +arr2[1]);


    }
    public static int[] twosum(int[] arr, int t){
        int len=arr.length;
        int num[]=new int [2];
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]+arr[j]==t){
                    num[0]=i;
                    num[1]=j;
                }
            }
        }
        return num;
    }
}