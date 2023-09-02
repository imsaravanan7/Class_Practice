public class findFirstLast_34{
    public static void main(String args[]){
        int arr[]={1,1,3,4,5,6,6,7,8};
        int target=6;
        int arr2[]=new int[2];
        for(int a=0; a<arr.length; a++){
            // for(int b=a+1; b<arr.length; b++){
            if(arr[a]==target){
                arr2[0]=arr[a];
                arr2[1]=arr[a];
            }
            // else{
            //     arr2[0]=-1;
            //     arr2[1]=-1;
            // }
            // }
        }
        for(int a=0; a<arr2.length; a++){
            //for(int b=a+1; b<arr.length; b++){
            System.out.println(a);
        }
        
    }
}