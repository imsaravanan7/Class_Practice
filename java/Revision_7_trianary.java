import java.util.*;

public class Revision_7_trianary{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char year=scan.next().charAt(0);

        String year$1=(year=='a'||year=='e'||year=='i'||year=='o'||year=='u')?"'Vowels'":"'Consonant'";
        String year$2=(year=='A'||year=='E'||year=='I'||year=='O'||year=='U')?"'Vowels'":"'Consonant'";
        System.out.print("The given Character is "+year$1);
    }
}