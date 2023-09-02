public class ForArray_greater{
    public static void main(String args[]){
        int num[]={13,1,4,7,9,3,6,0,11,2};
        int leng=num.length;
        int check=num[0];
        int number=10;

        for(int i=0; i<leng; i++){
            for(int j=i+1; j<leng; j++){
                if(num[i]<num[j]){
                   number=num[i];  //10=13;
                   num[i]=num[j];  //13=0;
                   num[j]=number;  //0=13;
                    

                }
            }
        }
        for(int i=0;i<leng;i++){
            System.out.println(num[i]);
        }
        

    }
}   