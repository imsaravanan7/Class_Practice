public class Lc_Remove_Dupli_26{
    public static void main(String args[]){
        int[] arr={2,4,0,1,1,2,3,4,2};
        int len=arr.length;
        int temp=0;
        int rep=111;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]==arr[j]){
                    arr[i]=0;
                }
            }
        }
        for(int a=0; a<len; a++){
            for(int b=a+1; b<len; b++){
                if(arr[a]>arr[b]){
                temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
            }
            }
            System.out.println(arr[a]);
        }
        
    }
}