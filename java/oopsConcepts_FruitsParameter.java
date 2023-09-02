public class oopsConcepts_FruitsParameter{
    public static void main(String args[]){
        Fruits varie=new Fruits("Orange","Sweet and Sour","Orange","Good Quality",3,5);
        System.out.println(varie.toString());

        Fruits fresh=new Fruits();
        // fresh.setValues("Pine Apple","Sweet & Sour","Red","Good Quality",5,6);
        System.out.println(fresh.toString());
    }
}
class Fruits{
    public String name;
    public String taste;
    public String color;
    public String quality;
    public int calcium;
    public int iron;
    
    public Fruits(){
        this.name="Apple";
        this.taste="Sweet";
        this.color="Red";
        this.quality="Good Quality";
        this.calcium=2;
        this.iron=5;
    }
    public Fruits(String name,String taste,String color,String quality,int calcium,int iron){
        this.name=name;
        this.taste=taste;
        this.color=color;
        this.quality=quality;
        this.calcium=calcium;
        this.iron=iron;
    }
    public String toString(){
        String word="       Fruits Variety \n";
        word+="Fruit Name : "+name+"\n";
        word+="Taste : "+taste+"\n";
        word+="Color : "+color+"\n";
        word+="Quality : "+quality+"\n";
        word+="Calcium : "+calcium+"\n";
        word+="Iron : "+iron+"\n";
        return word;
    }
}
