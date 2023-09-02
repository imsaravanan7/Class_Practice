import java.util.*;

public class Trianary_college_admin{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Gender : ");
        String gen=scan.nextLine();
        String gender=gen.toUpperCase();
        System.out.print("Enter Your Score : ");
        int score=scan.nextInt();
        if(gender.contains("FEMALE")==true){
            System.out.print("Female No admission ");
            }
        else if(gender.contains("MALE")==true&&gender.contains("FEMALE")==false&&score>=70){
            System.out.print("Male Admission");
        }
        else{
            System.out.print("Not Eligible");
        }
        

        // boolean fm=(gender.contains("FEMALE"))?true:false;
        // boolean m=(gender.contains("MALE"))?true:false;
        // String adm=(!fm && m && score>=70)?"Male Admission":" No Admission";
        // System.out.print(adm);
    }
}