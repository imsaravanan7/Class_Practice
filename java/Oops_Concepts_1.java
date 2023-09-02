class car{
    public String brand;
    public int speed;
    public String plateNo;

    public void variety(String name){
        System.out.println("The Brand Is : "+name);
    }
    public void Num(int number){
        System.out.println("Speed of The Car Is : "+number);
    }
    public void special(String plate){
        System.out.println("The Plate Number Is : "+plate);
    }
}
public class Oops_Concepts_1{
    public static void main(String args[]){
        car saroo=new car();
        saroo.variety("Volvo X95");
        saroo.Num(170);
        saroo.special("TN39 CF7709");
    }
}