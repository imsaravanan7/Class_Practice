public class Zoho_Ques_5{
    public static void main(String args[]){
        int arr1[]={2,4,7,9,3,0,6};
        int arr2[]={10,19,7,8};
        int arr3[]=new int[arr1.length+arr2.length];
        int c=0;
        for(int a=0; a<arr3.length; a++){
            if(a<arr1.length){
                arr3[a]=arr1[a];
            }
            else{
                arr3[a]=arr2[c];
                c++;
            }
        }
        for(int a=0; a<arr3.length; a++){
            for(int b=a; b<arr3.length; b++){
                if(arr3[a]>arr3[b]){
                    c=arr3[a];
                    arr3[a]=arr3[b];
                    arr3[b]=c;
                }
            }
            System.out.print(arr3[a]+" ");
        }
    }
}