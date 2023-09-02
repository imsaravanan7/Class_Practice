public class Multi_arraypract{
    public static void main(String args[]){
        int num[][]={{1,2,3,4},{5,7,6,3},{1,5,9,3}};
        int len=num.length;
        int len2=num[0].length;

        for(int i=0; i<len; i++){
            System.out.print("The "+(i+1)+" Array ;");
            for(int j=0; j<len2; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}