public class oopsConcept_inheritanceMulti{
    public static void main(String args[]){
        wholesale detail=new wholesale();
        detail.addProduct_Prices("IPHONE",22000);
        detail.addProduct_Prices("DUKE",200000);
        detail.display();

        retailSale detail1=new retailSale();
        detail1.addProduct_Prices("IPHONE",22000);
        detail1.addProduct_Prices("DUKE",200000);
        detail1.display1();
    }
}
class Sale{
    public String products[]=new String[100];
    public int prices[]=new int[100];
    public int productCount=0;

    public void addProduct_Prices(String product, int price){
        this.products[productCount]=product;
        this.prices[productCount]=price;
        productCount++;
    } 
}
class wholesale extends Sale{
    public void display(){
        System.out.println("    ' WHOLE SALE !!! ' "+"\n");
        for(int a=0; a<productCount; a++){
            System.out.println("PRODUCT : "+products[a]);
            System.out.println("PRICE : "+prices[a]);
            float num=prices[a]-(float)(prices[a]*20/100);
            System.out.println("After The Discount 20% : "+num+"\n");
        }
    }
}
class retailSale extends Sale{
    public void display1(){
        System.out.println("    ' RETAIL SALE !!! ' "+"\n");
        for(int a=0; a<productCount; a++){
            System.out.println("PRODUCT : "+products[a]);
            System.out.println("PRICE : "+prices[a]);
            float num=prices[a]-(float)(prices[a]*2/100);
            System.out.println("After The Discount 2% : "+num+"\n");
        }
    }
}

