public class ForArray_num{
    public static void main(String args[]){
        int num[]={1,2,2,1,4,4,1,3,9};
        int leng=num.length;
        int a=0;

        for(int i=0; i<leng; i++){
            //System.out.println(num[i]);
            a+=num[i];
        }
        System.out.println(a);
    }
}