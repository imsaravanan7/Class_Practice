import java.util.Scanner;

class input{
    public static void main(String args[]){
        Scanner val= new Scanner(System.in);
        String str;
        Boolean bool;
        int a;
        long num;
        float fl;
        double dbl;
        byte byt;
        short srt;
        char ch;
        System.out.print("Enter a String : ");
        str=val.nextLine();
        System.out.print("Enter a Boolean : ");
        bool=val.nextBoolean();
        System.out.print("Enter a character : ");
        ch=val.nextChar();
        System.out.print("Enter a integer : ");
        a=val.nextInt();
        System.out.print("Enter a Long num : ");
        num=val.nextLong();
        System.out.print("Enter a Float : ");
        fl=val.nextFloat();
        System.out.print("enter a Double : ");
        dbl=val.nextDouble();
        System.out.print("Enter a Byte : ");
        byt=val.nextByte();
        System.out.print("Enter a Short Num: ");
        srt=val.nextShort();
        System.out.println("Enter a Character: ");
        ch=val.next().charAt(0);
        System.out.println(str);
        System.out.println(bool);
        System.out.println(ch);
        System.out.println(a);
        System.out.println(num);
        System.out.println(fl);
        System.out.println(dbl);
        System.out.println(srt);
        System.out.print(ch);
    }
}






// import java.util.Scanner;

// class input{
//     public static void main(String args[]){
//         Scanner name=new Scanner(System.in);
//         String word;
//         int num;
//         float fl;
//         System.out.print("Enter a Word : ");
//         word=name.nextLine();
//         System.out.print("Enter a Integer Num : ");
//         num=name.nextInt();
//         System.out.println(word);
//         System.out.println(num);
//     }
// }