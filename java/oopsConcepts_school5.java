public class oopsConcepts_school5{
    public static void main(String args[]){
        classes school=new classes();
        school.noOfBench=12;
        school.noOfStudents=48;
        school.teacherName="PRIYA ";
        school.studentName[0]="SARAVANAN";
        school.studentName[1]="ASHIF";//,"SANTHOSH","KANNAN"};
        System.out.println(school.toString());
    }
}
class classes{
    public int noOfBench;
    public int noOfStudents;
    public String teacherName;
    public String[] studentName=new String[30];;

    public String toString(){
        String val="Details of ClassRooms \n";
        val+="NumOfBench : "+this.noOfBench+"\n";
        val+="NumofStudents : "+this.noOfStudents+"\n";
        val+="TeacherName : "+this.teacherName+"\n";
        val+="StudentName : "+this.studentName[0]+"\n";
        val+="StudentName : "+this.studentName[1]+"\n";
        return val;
    }
}