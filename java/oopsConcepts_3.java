public class oopsConcepts_3{
    public static void main(String args[]){
        person saravanan=new person();
        saravanan.name="SARAVANAN";
        saravanan.age=20;
        saravanan.phoneNo=8056964129L;
        saravanan.value();
        //System.out.println(saravanan.value());

        person santhosh=new person();
        santhosh.name="santhosh";
        santhosh.age=23;
        santhosh.phoneNo=8035366329L;
        santhosh.value();
        //System.out.println(santhosh.value());
    }
}
class person{
    public String name;
    public int age;
    public long phoneNo;

    public void value(){
       String str="Person Details \n";
       str+="Name :"+this.name+"\n";
       str+="Age :"+this.age+"\n";
       str+="PhoneNo :"+this.phoneNo+"\n";        
        //return str;
        System.out.println(str);
    }
}
