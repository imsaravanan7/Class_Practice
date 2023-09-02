public class oopsConcepts_Dog_6{
    public static void main(String args[]){
        dog str=new dog();
        str.data("Berk","Golden","Cross",3,"3KG");
        System.out.println(str.toString());
    }
}
class dog{
    public String sound;
    public String color;
    public String breed;
    public int age;
    public String weight;

    public String toString(){
        String word="Dog Variety\n";
        word+="Sound : "+this.sound+"\n";
        word+="Color : "+this.color+"\n";
        word+="Breed : "+this.breed+"\n";
        word+="Age : "+this.age+"\n";
        word+="weight : "+this.weight+"\n";
        return word;
    }

public void data(String sound,String color,String breed,int age,String weight){
        this.sound=sound;
        this.color=color;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
        
}
}