import java.util.*;

public class Array_Ques_1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];

        for(int a=0; a<arr.length; a++){
            System.out.print("Enter A Number : ");
            int num=scan.nextInt();
            arr[a]=num;
            
        }
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println("The MAx Value "+arr[0]);
            System.out.println("The Min Value "+arr[arr.length-1]);
            break;
        }
    }
}