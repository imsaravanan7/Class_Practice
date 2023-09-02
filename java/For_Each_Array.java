public class For_Each_Array{
    public static void main(String args[]){
        int [] arr={1,2,3,4,6,5,3};
       
        for(int i=0;i<5;i++){
            if(i==1 || i==3){
                break;
            }
            System.out.println(i);
        }
    }
}