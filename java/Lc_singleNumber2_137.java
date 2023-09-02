public class Lc_singleNumber2_137 {
    public static void main(String args[]) {
        int[] nums={0,1,0,0,0,0,99};
        int len=nums.length;
//         for(int i=0; i<len-1; i++){
//             for(int j=i+1; j<len; j++){
//                 if(nums[i]==nums[j]){
//                     nums[i]=0;
//                     // nums[j]=0;
//                     System.out.print(nums[i]+" ");
//                     // System.out.print(nums[j]+" ");
//                 }
//             }
//         }
//         for(int i=0; i<len; i++){
//             if(nums[i]>0||nums[i]<0){
//                 System.out.print(nums[i]+" ");
//             }
//         }
//     }
// }
    int m=1;
        for(int i=0; i<len; i++){
        m=m^nums[i];
        }
        System.out.println(m);
    }
}