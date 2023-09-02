public class Arraychar_ascending{
    public static void main(String args[]){
        char alp[]={'Q','W','D','A','Z','Y','E','B','P'};
        char alpha='D';

        for(int i=0; i<alp.length; i++){
            for(int j=i+1; j<alp.length; j++){
                if(alp[i]>alp[j]){
                    alpha=alp[i];
                    alp[i]=alp[j];
                    alp[j]=alpha;
                }
            }
        }
        for(int i=0; i<alp.length; i++){
            System.out.println((char)alp[i]);
        }
    }
}