public class ifalb{
    public static void main(String[] args){
        char a='@';
        if((a>='a'&&a<='z')||(a>='A'&&a<='Z')){
            System.out.println("is it albapet");
        }
        else if(a>='0'&&a<='9'){
            System.out.println("is it number");
        }
        else{
            System.out.println("is it a special charactor");
        }
    }
}