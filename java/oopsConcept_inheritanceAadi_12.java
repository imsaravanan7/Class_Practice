public class oopsConcept_inheritanceAadi_12{
    public static void main(String args[]){
        AadiSale detail=new AadiSale();
        // System.out.println(detail.Disc());
        System.out.println(detail.toString());

        // AadiSale detail1=new AadiSale("Pant",599,"Kids Wear");
        // System.out.println(detail1.toString());
    }
}
class Sale{
    public String product;
    public int price;
    public String category;

    public Sale(){
        this.product="Shirt";
        this.price=450;
        this.category="Mens Wear";
    }  
    public Sale(String product,int price, String category){
        this.product=product;
        this.price=price;
        this.category=category;
    }
    public String toString(){
        String word="SARAVANAN STORES \n";
        word+="Product Name : "+product+"\n";
        word+="Price : "+price+"\n";
        word+="Category : "+category+"\n";
        return word;
    }
}
class AadiSale extends Sale{
    public int discountper;

    public AadiSale(){
        super("Shirt",450,"Mens wear");
        this.discountper=20;
        // this.discount=this.Disc();
    }
    public AadiSale(int discountper,int discount,String product,int price,String category){
        super(product,price,category);
        this.discountper=discountper;
       // this.discount=this.Disc();
    }
    public String toString(){
        String word="AADI SALE \n";
        word+=super.toString();
        word+="After the Discount : "+this.Disc()+"\n";
        return word;
    }
    public int Disc(){
        int disc=this.price-(this.discountper*this.price)/100;
        return disc;
    }
}