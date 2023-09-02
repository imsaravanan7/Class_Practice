public class ForArrayin_notin{
    public static void main(String args[]){
        int num[]={1,4,7,9,3,6,0,11,1,2,1};
        // int target=20;
        int leng=num.length;
        // int a=num[0];
        int num1=100;
        int a=0;

        for(int i=0; i<leng; i++){
            if(num[i]==num1){
            a++;
            }
          
        }
        if(a>0){
                 System.out.println(true);
            }
        else{
            System.out.println(false);
        }
    }
}