public class oopsConcepts_fruit4{
    public static void main(String args[]){
        fruits apple=new fruits();
        apple.color="RED";
        apple.taste="SWEET";
        apple.quality="GOOD QUALITY";
        apple.calci=2;
        apple.variety();
        //System.out.println(apple.toString());
    }
}
class fruits{
    public String color;
    public String taste;
    public String quality;
    public int calci;

    public void variety(){
        String str="Fruits variety \n";
        str+="Color : "+this.color+"\n";
        str+="Taste : "+this.taste+"\n";
        str+="Quality : "+this.quality+"\n";
        str+="Calcium Percentage : "+this.calci+"\n";
        System.out.println(str);
    }
}