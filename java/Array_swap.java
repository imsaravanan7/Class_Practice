public class Array_swap{
    public static void main(String arg[]){
        int arr[]={1,2,3,48,5,6,77,8,9,10};
        int len=arr.length;
        int temp;

        for(int i=0; i<len/2; i++){
            temp=arr[i];
            arr[i]=arr[len-1-i];
            arr[len-1-i]=temp;
        }
        for(int i=0; i<len; i++){
            System.out.println(arr[i]);
            if(arr[i]==77){
                System.out.println("index of 77 is => "+i);
            }
        }
    }
}