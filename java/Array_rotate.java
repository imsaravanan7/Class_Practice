public class Array_rotate{
    public static void main(String args[]){
        int number[][]={{1,2,3},{4,5,6},{7,8,9}};
        int num[][]=new int[3][3];
    
        int leng=number.length;

        for(int i=0; i<leng; i++){
          
            for(int j=leng-1; j>=0; j--){
                    num[i][j]=number[leng-j-1][i];
               
            }
           
        }
         for(int i=0; i<leng; i++){
          
            for(int j=0; j<leng; j++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}