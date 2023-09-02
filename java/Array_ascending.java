public class Array_ascending{
    public static void main(String args[]){
        int num[]={1,7,3,9,2,8,11,4};
        int check=num[0];
        int number=0;
        
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
            if(num[i]>num[j]){
                number=num[i];
                num[i]=num[j];
                num[j]=number;
            }
        }
        }
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}