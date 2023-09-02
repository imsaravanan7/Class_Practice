public class Multi_array{
    public static void main(String args[]){
        int num[][]={{1,2,3,5},{4,5,6,7},{7,8,9,10}};
        int len=num.length;
        int len2=num[0].length;

        for(int i=0; i<len; i++){
             System.out.println("The "+(i+1)+" Array");
            for(int j=0; j<len2; j++){
                System.out.print(num[i][j]+"  ");
           }
           System.out.println();
        }
    }
}