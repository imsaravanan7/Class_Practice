public class oopsConcepts_Application_8{
    public static void main(String args[]){
        Application detail=new Application("SARAVANAN","05-02-2003",400,"BSC C.S","MURUGAN","LAKSHMI");
        System.out.println(detail.toString());

        Application detail1=new Application();
        System.out.println(detail1.toString());

    }
}
class Application{
    public String name;
    public String dateOfBirth;
    public int mark12Th;
    public String course;
    public String fatherName;
    public String motherName;

    public Application(String name,String dateOfBirth,int mark12Th,String course,String fatherName,String motherName){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.mark12Th=mark12Th;
        this.course=course;
        this.fatherName=fatherName;
        this.motherName=motherName;
    }

    public Application(){
        this.name="Abc";
        this.dateOfBirth="00-00-2000";
        this.mark12Th=600;
        this.course="BSC C.S";
        this.fatherName="DEF";
        this.motherName="GHI";
    }
    public String toString(){
        String val="        APPLICATION FORM \n";
        val+="NAME : "+this.name+"\n";
        val+="DOB : "+this.dateOfBirth+"\n";
        val+="12Th Mark : "+this.mark12Th+"\n";
        val+="COURSE : "+this.course+"\n";
        val+="FATHER NAME : "+this.fatherName+"\n";
        val+="MOTHER NAME : "+this.motherName+"\n";
        return val;
    }   
}