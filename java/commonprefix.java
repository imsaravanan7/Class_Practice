public class commonprefix{
    public static void main(String [] args){
        String arr[]={"flight","low","fly"};
        
        // for(int i=0; i<arr.length; i++){
            if(arr[0].charAt(0)==arr[1].charAt(0)&&arr[0].charAt(0)==arr[2].charAt(0)){
                System.out.println(arr[0].charAt(0));  
            }
            else{
            System.out.print("Not common prefix values");
        }
            if(arr[0].charAt(0)==arr[2].charAt(0)){
                System.out.println(arr[0].charAt(0));

                if(arr[0].charAt(1)==arr[2].charAt(1)){
                System.out.println(arr[0].charAt(1));
                }
                else{
                    System.out.print("Not common prefix values");
                }
        }
        else{
            System.out.print("Not common prefix values");
        }

    }
}