public class Binary_To_Decimal{
    public static void main(String args[]){
        int num[]={1,1,0,1,1,};
        int res=0;
        int j=0;
        for(int i=num.length-1;i>=0;i--){
           res+=num[i]*Math.pow(2,j);
           j++;
        } 
        System.out.print(res);
    }
}