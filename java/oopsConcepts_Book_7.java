public class oopsConcepts_Book_7{
    public static void main(String args[]){
        book detail=new book();
        detail.setValues(500,"Abdul Kalam","Male",1000,"10-7-2008");
        

        factory nam=new factory("A1 FACTORY","FOOD PRODUCING","MUMBAI",50,12000);
        // nam.details("A1 FACTORY","FOOD PRODUCING","MUMBAI",50,12000);
        System.out.println(nam.toString());

    }
}
class book{
    public int noOfPages;
    public String author;
    public String gender;
    public int price; 
    public String date;

    public String toString(){
        String val="        Book Details "+"\n";
        val+="No Of Pages : "+this.noOfPages+"\n";
        val+="Author : "+this.author+"\n";
        val+="Gender : "+this.gender+"\n";
        val+="Price : "+this.price+"\n";
        val+="Date : "+this.date+"\n";
        return val;
    }  
    public void setValues(int noOfPages,String author,String gender, int price,String date){
        this.noOfPages=noOfPages;
        this.author=author;
        this.gender=gender;
        this.price=price;
        this.date=date;
        System.out.println(this.toString());
    }
}
class factory{
    public String name;
    public String work;
    public String place;
    public int noOfWorkers;
    public int salary;

    public factory(String name,String work,String place,int noOfWorkers,int salary){
        this.name=name;
        this.work=work;
        this.place=place;
        this.noOfWorkers=noOfWorkers;
        this.salary=salary;
    }

    public String toString(){
        String val="Factory Details "+"\n";
        val+="Name Of Factory : "+this.name+"\n";
        val+="Work : "+this.work+"\n";
        val+="Place : "+this.place+"\n";
        val+="Name Of Workers : "+this.noOfWorkers+"\n";
        val+="Salary : "+this.salary+"\n";
        return val;
    }
}