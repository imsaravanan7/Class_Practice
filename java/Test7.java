import java.util.Scanner;       //Declare Using Arithmetic Operators

class Test7{
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
        int tamil1;
        int tamil2;
        int tamil3;
        int tamil4;
        int tamil5;
        int english1;
        int english2;
        int english3;
        int english4;
        int english5;
        int math1;
        int math2;
        int math3;
        int math4;
        int math5;

        System.out.print("Enter ur Name 1 : ");
        name1=val.nextLine();
        System.out.print("Enter ur Tamil Mark 1 : ");
        tamil1=val.nextInt();
        System.out.print("Enter ur English Mark 1 : ");
        english1=val.nextInt();
        System.out.print("Enter ur math Mark 1 : ");
        math1=val.nextInt();
        int total1=tamil1+english1+math1;
        float percent1=total1/3;

        name2=val.nextLine();
        System.out.print("Enter ur Name 2 : ");
        name2=val.nextLine();
        System.out.print("Enter ur Tamil Mark 2 : ");
        tamil2=val.nextInt();
        System.out.print("Enter ur English Mark 2 : ");
        english2=val.nextInt();
        System.out.print("Enter ur math Mark 2 : ");
        math2=val.nextInt();
        int total2=tamil2+english2+math2;
        float percent2=total2/3;
        
        name3=val.nextLine();
        System.out.print("Enter ur Name 3 : ");
        name3=val.nextLine();
        System.out.print("Enter ur Tamil Mark 3 : ");
        tamil3=val.nextInt();
        System.out.print("Enter ur English Mark 3 : ");
        english3=val.nextInt();
        System.out.print("Enter ur math Mark 3 : ");
        math3=val.nextInt();
        int total3=tamil3+english3+math3;
        float percent3=total3/3;

        name4=val.nextLine();
        System.out.print("Enter ur Name 4 : ");
        name4=val.nextLine();
        System.out.print("Enter ur Tamil Mark 4 : ");
        tamil4=val.nextInt();
        System.out.print("Enter ur English Mark 4 : ");
        english4=val.nextInt();
        System.out.print("Enter ur math Mark 4 : ");
        math4=val.nextInt();
        int total4=tamil4+english4+math4;
        float percent4=total4/3;

        name5=val.nextLine();
        System.out.print("Enter ur Name 5 : ");
        name5=val.nextLine();
        System.out.print("Enter ur Tamil Mark 5 : ");
        tamil5=val.nextInt();
        System.out.print("Enter ur English Mark 5 : ");
        english5=val.nextInt();
        System.out.print("Enter ur math Mark 5 : ");
        math5=val.nextInt();
        int total5=tamil1+english1+math1;
        float percent5=total5/3;

        System.out.println("Name\t\tTamil\tEnglish\tMath\tTotal\tPercentage\t");

        System.out.println(name1+"\t "+tamil1+"\t"+english1+"\t"+math1+"\t"+total1+"\t"+percent1+"\t");
        System.out.println(name2+"\t\t"+tamil2+"\t"+english2+"\t"+math1+"\t"+total2+"\t"+percent2+"\t");
        System.out.println(name3+"\t\t"+tamil3+"\t"+english3+"\t"+math1+"\t"+total3+"\t"+percent3+"\t");
        System.out.println(name4+"\t\t"+tamil4+"\t"+english4+"\t"+math1+"\t"+total4+"\t"+percent4+"\t");
        System.out.println(name5+"\t\t"+tamil5+"\t"+english5+"\t"+math1+"\t"+total5+"\t"+percent5+"\t");
        
        
    }
}