import java.util.Arrays;
  
public class Function_Predefine_Fnc {
    public static void main(String[] args){
        int arr[]={ 10, 22, 15, 20, 35 ,2,1,4,6,8,25,90};
        int find = 22;
        int ans=search(arr,find);
        System.out.println();
        System.out.println("Index of : "+ans);
        
    }
    public static int search(int[] arr,int b){
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        int res=Arrays.binarySearch(arr,b);
        return res;    
    }
}