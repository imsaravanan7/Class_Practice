public class Array_Function_3_middle{
    public static int arr[]={1,8,5,7,9,20,9,2,10,12};
    public static void main(String args[]){
        float center=middle();
        System.out.print(center);
    }
    public static float middle(){
        int len=arr.length;
        if(len%2==1){
        return arr[len/2];
        }
        else{
            float arr1=arr[len/2]+(arr[len/2-1]);
            return arr1/2;
        }
    }
}