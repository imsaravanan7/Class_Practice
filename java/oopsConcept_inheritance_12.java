public class oopsConcept_inheritance_12{
    public static void main(String args[]){
        Fan name=new Fan();
        name.applianceName="FAN";
        name.powerConsumption=2.5f;
        name.price=4500;
        name.starRating=4.5f;
        name.noOfBlades=4;
        name.bladeSize=3.6f;
        System.out.println(name.toString());

    }
}
class Electricals{
    public String applianceName;
    public float powerConsumption;
    public int price; 
    public float starRating;

    public String toString(){
        String val="Electricals \n";
        val+="Appliance Name : "+applianceName+"\n";
        val+="Power Consumption : "+powerConsumption+"\n";
        val+="Price : "+price+"\n";
        val+="Star Rating : "+starRating+"\n";
        return val;
    }
}
class Fan extends Electricals{
    public int noOfBlades;
    public float bladeSize;

    public String toString(){
        String str="Fan \n";
        str+=super.toString();
        str+="No Of Blades : "+noOfBlades+"\n";
        str+="Blade Size : "+bladeSize+"\n";
        return str;
    }
}