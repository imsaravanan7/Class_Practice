import java.util.*;

public class Array_import_value{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int arr[]=new int[10];
        int arr1[]=new int[10];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter a NUmber : ");
            arr[i]=scan.nextInt();
            arr1[i]=arr[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}