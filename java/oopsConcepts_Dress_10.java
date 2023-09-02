import java.util.*;

public class oopsConcepts_Dress_10{
    public static void main(String args[]){
        Dress calci=new Dress();
        // calci.name="Lowyer";
        System.out.println(calci.toString());

        String[] avl=new String[]{"S","M","L","XL","XXL"};
        Dress calc=new Dress("Tshirt","Polyster",200,avl,20);
        System.out.println(calc.toString());

        System.out.println("The Discount Amount is : "+calc.calculateDiscount());

        String availability=calc.checkSize("XXXL")?"available":"not available";
        System.out.println("Your Size is : "+availability);
        String availability1=calci.checkSize("XL")?"available":"not available";
        System.out.println("Your Size is : "+availability1);
        
    }
} 
class Dress{
    private String name;
    private String material;
    private int price;
    private String size[];
    private int discount;

    public Dress(){
        this.name="Tshirt";
        this.material="Cotton";
        this.price=250;
        this.size=new String[]{"S","M","L","XL","XXL"};
        this.discount=25;
    }
    public Dress(String name,String material,int price,String size[],int discount){
        this.name=name;
        this.material=material;
        this.price=price;
        this.size=size;
        this.discount=discount;
    }
    public String toString(){
        String val="    Dress \n";
        val+="Name : "+name+"\n";
        val+="MATERIAL : "+material+"\n";
        val+="PRICE : "+price+"\n";
        val+="SIZE : "+Arrays.toString(size)+"\n";
        val+="DISCOUNT : "+discount+"\n";
        return val;
    }
    public boolean checkSize(String reqSize){
        for(int a=0; a<size.length; a++){
            if(size[a].equals(reqSize)){
                return true;
            
            }
        }
        return false;
    }
    public int calculateDiscount(){
        int disc=this.price-(this.price*this.discount/100);
        return disc;       
    }
}