public class Rough{
    public static void main(String args[]){
        int arr[]={1,7,9,3,5,0,4,8};
        int miss[]={10,20,30,40,50};
        int nums[]=new int[arr.length+miss.length];
        int b=0;
        for(int a=0; a<arr.length; a++){
            if(a<nums.length){
                nums[a]=arr[a];
            }
            else{
                nums[a]=miss[b];
                b++;
            }
        }
        for(int c=0; c<nums.length; c++){
            System.out.print(nums[c]+"   ");
        }
    }
}