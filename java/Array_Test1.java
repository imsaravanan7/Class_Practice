public class Array_Test1{       //https://www.geeksforgeeks.org/top-50-array-coding-problems-for-interviews/
    public static void main(String args[]){
        int arr[]={10,4,110,50,2};
        int len=arr.length;
        int max;
        int arr1[]=new int[len];

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]>arr[j]){
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;
                    
                }
//                 arr1[i]=arr[i];
// System.out.println(arr1[i]);
            }
        }
        for(int i=0; i<len; i++){
        System.out.println("The highest num is : "+arr1[i]);
        System.out.println("The Smallest num is : "+arr1[4]);
        }
    }
}