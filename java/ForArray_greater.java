public class ForArray_greater{
    public static void main(String args[]){
        int num[]={1,4,7,9,3,6,0,11,2};
        int leng=num.length;
        int a=0;

        for(int i=0; i<leng; i++){
            if(a<num[i]){
                a=num[i];
            }
           
        }
        System.out.println(a);
        }

    }
