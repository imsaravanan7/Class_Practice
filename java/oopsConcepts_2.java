public class oopsConcepts_2{
    public static void main(String args[]){
        bike name=new bike();
        name.variety("Duke 200");
        name.cost(250000);
        name.fast("160 Km/hr");

        school val=new school();
        val.name("SARAVANAN");
        val.mark(450);
        val.list(3);
    }
}
class bike{
    public String brand;
    public int rate;
    public String speed;

    public void variety(String brand){
        System.out.println("The Bike Brand Is : "+brand);
    }
    public void cost(int rate){
        System.out.println("The Bike Cost Is : "+rate);
    }
    public void fast(String speed){
        System.out.println("The Bike Speed Is : "+speed);
    }
}
class school{
    public String students;
    public int marks; 
    public int rank;

    public void name(String students){
        System.out.println("The Student Name is : "+students);
    }
    public void mark(int marks){
        System.out.println("The student Mark Is : "+marks);
    }
    public void list(int rank){
        System.out.println("The Studen Rank Is : "+rank);
    }
} 