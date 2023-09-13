public class Arraymiddle_valuemerge{
    public static void main(String args[]){
        int num[]={2,3,7,9,11,90,67};
        int num2[]={1,3};

        int l=num.length+num2.length;
        int num3[]=new int [l];
        
        int j=0;
        for(int i=0;i<l;i++){
            if(i<num.length){
                num3[i]=num[i];
            }
            else{
            num3[i]=num2[j];
            j++;
            }
        }
        int temp=0;
        for(int i=0;i<l;i++){
            for(int k=i+1; k<l; k++){
                if(num3[i]>num3[k]){
                    temp=num3[i];
                    num3[i]=num3[k];
                    num3[k]=temp;
                }
            }
        System.out.print(num3[i]+"  ");
        }   
    }
}