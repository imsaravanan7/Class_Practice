public class Arraymiddle_value{
    public static void main(String args[]){
        int num[]={4,7,2,8,11,0,8,5};
        int num1[]={5,3,4,6,5};
        int len=num.length;
        int len2=num1.length;
        int len3=(len+len2);
        

        int num2[]=new int[len3];
        int j=0;
        for(int i=0; i<len3; i++){
            if(i<len){
                num2[i]=num[i];
                
            }
            else {
                num2[i]=num1[j];
               
                j++;

            }     
              
        }
        
        int store=0;
        for(int i=0; i<num2.length; i++){
            for(int k=i+1; k<num2.length; k++){
                if(num2[i]>num2[k]){
                    store=num2[i];
                    num2[i]=num2[k];
                    num2[k]=store;
                }
            }
        }
     
        for(int i=0; i<num2.length; i++){
            System.out.println(num2[i]);
        }

        // int num2[]=new int[len];

        
            // if(len%2==0){
            //     int num3=len/2;  // 8/2=4; =11;
            //     int num4=num3-1; // 4-1=3; =8;
            //     float num5=((float)(num[num3]+num[num4])/2); //11+8=19; =9.5;
            //     System.out.print(num5);
                
            // }
            // else{
            //     System.out.print(num[len/2]);
            // }
        
    }
}























