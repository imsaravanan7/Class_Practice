public class Lc_Firstpositive{
    public static void  main(String args[]){
        int num[]={51,71,31,21,41,1,2,4,3,5,7,6};
        int len=num.length;
        int num1=12;

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
            if(num[i]<num[j]){
                num1=num[i];
                num[i]=num[j];
                num[j]=num1;
            }
            }
        }
        int k=1;
        int s=0;
        for(int i=0; i<len; i++){
            if(num[i]>0){
                for( int j=1; j<len; j++){
                if(num[i]==k){
                    k++;
                    break;
                }
                else{
                    System.out.print(k);
                    s++;
                    break;
                }       
                }
            if(s!=0){
                break;
            }
           }
        }
    }
}