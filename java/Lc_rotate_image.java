class Lc_rotate_image{
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        int num[][]=new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=len-1; j>=0; j--){
                num[i][j]=matrix[len-j-1][i];
            }
        }
        for(int i=0; i<len; i++){  
            for(int j=0; j<len; j++){
                matrix[i][j]=num[i][j];
            }
            System.out.println();
        }
    }
}