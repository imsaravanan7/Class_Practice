public class Main2{
    public static void main(String args[]){
        
        Car maruti=new Car();
        maruti.color="Black";
        maruti.make="Volvo";
        System.out.println(maruti.color);
        System.out.println(maruti.make);

        Car toyoto=new Car();
        toyoto.color="White";
        toyoto.make="X800";
        System.out.println(toyoto.color);
        System.out.println(toyoto.make);

        Car skoda=new Car();
        skoda.color="Blue";
        skoda.make="Ultra";
        System.out.println(skoda.color);
        System.out.println(skoda.make);
        
        Car bmw=new Car();
        bmw.color="Yellow";
        bmw.make="X900";
        System.out.println(bmw.color);
        System.out.println(bmw.make);

        skoda.color="Orange";  
        System.out.println(skoda.color);     
    }
}
class Car{
    public String color;
    public String make;
}