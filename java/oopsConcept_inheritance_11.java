public class oopsConcept_inheritance_11{
    public static void main(String args[]){
        // Animal varie=new Animal();
        // System.out.println(varie.toString());

        PetAnimals varies=new PetAnimals();
        System.out.println(varies.toString());
    }
}
class Animal{
    public String name;
    public String gender;

    public Animal(){
        this.name="Dog";
        this.gender="Male";
    }
    public Animal(String name,String gender){
        this.name=name;
        this.gender=gender;
    }
    public String toString(){
        String val="Animal Variety \n";
        val+="Name : "+this.name+"\n";
        val+="Gender : "+this.gender+"\n";
        return val;
    }
}
class PetAnimals extends Animal{
    public String breed;
    public boolean trained;

    public PetAnimals(){
        super("Dog","Male");
        this.breed="Cross";
        this.trained=true;
    }
    public PetAnimals(String name,String gender, String breed, boolean trained){
        super(name,gender);
        this.breed=breed;
        this.trained=trained;

    }
    public String toString(){
        String val="Pet Animals \n";
        val+=super.toString();
        val+="Breed : "+breed+"\n";
        val+="Trained : "+trained+"\n";
        return val;
    }
}