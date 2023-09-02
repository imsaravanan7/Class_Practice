public class Multi_arraypract{
    public static void main(String args[]){
        int num[][]={{1,2,3,4},{5,7,6,3},{1,5,9,3}};
        int num1[][]={{5,7,6,3},{1,5,9,3},{1,2,3,4}};
        int len=num.length;
        int len1=num[0].length;
       

        for(int i=0; i<len; i++){
            for(int l=0; l<len1; l++){
                System.out.print(num[i][l]+num1[i][l]+"  ");
            }
            System.out.println();
        }       

    }
}