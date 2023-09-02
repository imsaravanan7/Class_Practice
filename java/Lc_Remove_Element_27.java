public class Lc_Remove_Element_27{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,1,2,8,1};
        int len=arr.length;
        int remove=1;

        for(int a=0; a<len; a++){
            for(int b=a+1; b<len-1; b++){
                if(arr[a]==remove){
                    arr[a]=(char)'_';
                }
            }
        }
        int temp=10;
        for(int a=0; a<len; a++){
            // for(int b=a+1; b<len; b++){
            //     if(arr[a]>arr[b]){
            //         temp=arr[a];
            //         arr[a]=arr[b];
            //         arr[b]=temp;
            //     }
            // }
            System.out.println(arr[a]);
        }
    }
}