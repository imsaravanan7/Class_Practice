public class Lc_move_Zeroes_283{
    public static void main(String args[]){
        int arr[]={1,4,0,3,0,13};
        int len=arr.length;
        int a=0;
        int b=0;
        int arr1[]=new int [len];


        for(int i=0; i<len; i++){
                if(arr[i]!=0){
                    arr1[a]=arr[i];
                    a++;
                }
             
        }
        for(int i=0; i<len; i++){
            System.out.println(arr1[i]);
        }
    }
}
