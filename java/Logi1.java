class Logi1{
    public static void main(String []args){

        int a=10;
        int b=9;
        int c=4;

        if(a>b&&a>c){
            System.out.print("A is greaten than b&c");
        }
        else if(b>a&&b>c){
            System.out.print("B is greaten than a&c");
        }
        else if(c>b&&c>a){
            System.out.print("C is greaten than b&a");
        }
        else{
            System.out.print("Error");
        }
    
    }

}