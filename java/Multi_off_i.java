public class Multi_off_i{
    public static void main(String args[]){
        int arr[][]={{1,5,3},{1,2,3,4},{5,7,8}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][i]);
            }
        }
    }  
}