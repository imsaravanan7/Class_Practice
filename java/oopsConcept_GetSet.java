public class oopsConcept_GetSet{
    public static void main(String args[]){
        Shoes foot1=new Shoes();
        foot1.setMaterial("Casual Shoes");
        foot1.setSize(7);
        foot1.getBrand("VKC");
        System.out.println(foot1.toString());
        
        Crocs foot=new Crocs();
        foot.setMaterial("Leather");
        foot.setSize(9);
        foot.setCrocsType("WARR");
        foot.setColor("BLACK");
        System.out.println(foot.toString());
    }
}
class Material{
    private String material;
    private int size;

    public String toString(){
        String val="FOOTWEAR \n";
        val+="Material : "+this.material+"\n";
        val+="Size : "+this.size+"\n";
        return val;
    } 
    public int getMaterial(){
        return size;
    }
    public String getSize(){
        return material;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public void setSize(int size){
        this.size=size;
    }
}
class Shoes extends Material{
    private String brand;

    public String getBrand(){
        return brand;
    }
    public void getBrand(String brand){
        this.brand=brand;
    }
    public String toString(){
        String val="Shoes \n";
        val+=super.toString();
        val+="BRAND : "+this.brand+"\n";
        return val;
    }
}
class Crocs extends Material{
    private String crocsType;
    private String color;
    

    public String getCrocsType(){
        return crocsType;
    }
    public String getColor(){
        return color;
    }
    public void setCrocsType(String crocsType){
        this.crocsType=crocsType;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString(){
        String val="CROCS \n";
        val+=super.toString();
        val+="CROCS TYPE : "+this.crocsType+"\n";
        val+="COLOR : "+this.color+"\n";
        return val;
    }
}