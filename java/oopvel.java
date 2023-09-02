public class oopvel{
    public static void main(String [] args){
        WholeSale obj= new WholeSale();
        obj.addProduct_and_price("top",200);
        System.out.println(obj.productcount);
        obj.display();
    }
}
class sale{
    public String product[]=new String[100];
     public int price[]=new int[100];
     public String panner;
     public int productcount=0;
     public void addProduct_and_price(String product,int price){
        this.product[productcount]=product;
        this.price[productcount]=price;
        productcount++;
     }
}
class WholeSale extends sale{
    public void display(){
        for(int i=0;i<productcount;i++){
            System.out.println(this.product[i]+"  "+this.price[i]);
            float discount=this.price[i]-(float)(this.price[i]*0.2);
            System.out.println("the dicount price is "+discount);
            
        }
        System.out.println("wholesale");
    }
    
}