public class For_Array{
    public static void main(String args[]){
        String name[]={"saravanan","Ashif","Vishnu","Santhosh","Keerthi","Ganesh"};
        int leng=name.length;

        for(int i=leng-1;i>=0;i--){
            System.out.println(name[i]);
        }
    }
}