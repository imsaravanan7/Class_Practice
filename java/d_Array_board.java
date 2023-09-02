public class d_Array_board{
    public static void main(String args[]){
        char arr[][]={{'_','_','_','_','_'},{'_','_','_','_','_'},{'_','_','_','_','_'}};
        int len=arr.length;

        for(int i=0; i<len; i++){
            System.out.print(" | ");
            for(int j=0; j<arr[i].length; j++){

                System.out.print(arr[i][j]+" | ");
            }
            System.out.print("\n");
        }
    }
}