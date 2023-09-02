import java.util.Arrays;
class Fun{
    public static void main(String args[]){
        int arr[]={78,32,90,67,198,63,800,1};
        int val=90;

        int ind=search(arr,val);
        
        System.out.println("index:"+ind);

    }

    public static int search(int num[],int val){
        Arrays.sort(num);
        for(int a:num){
            System.out.println(a);
        }
        int i=Arrays.binarySearch(num,val);
        return i;
    }
} 