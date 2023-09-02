public class  Array_Function_1{
    public static void main(String args[]){
        int a=25;
        int b=37;
        int c=39;
        int small=smallest(a,b,c);
        System.out.print("The Smallest Number is "+small);
        smallest(a,b,c);
    }
    public static int smallest(int d,int e,int f){
        // if(d<e && d<f){
        //     return d;
        // }
        // else if(e<d && e<f){
        //     return e;
        // }
        // else if(f<e && f<d){

        //     return f;
        // }
        // else{
        //     return 0;
        // }
        return Math.min(Math.min(d,e),f);
    }
}