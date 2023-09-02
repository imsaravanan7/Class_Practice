import java.util.*;

public class oopsConcept_inheritanceContacts_13{
    public static void main(String args[]){
        Contact equal=new Contact();
        equal.addContact("KANNAN : 8152436790 ");
        equal.addContact("KRISHNAN : 8152436790");

        System.out.println(equal.findContact("ashif"));
        equal.deleteContact("kriShnaN");
        // System.out.println(equal.removeEmpty(""));
        
        System.out.println(equal.toString());

    }
}
class Contact{
    public String contacts[];
    public int currentLen=0;
    public int maxLen=100;
  
    public Contact(){
        contacts=new String[100];
    }
    public void addContact(String add){
        this.contacts[currentLen]=add;
        this.currentLen++;
    }
    public String toString(){
        String val="CONTACT DETAILS \n[";
        for(int a=0; a<currentLen; a++){
            val+=this.contacts[a];
        }
        val+="] \n";
        return val;
    }
    public boolean findContact(String find){
        for(int a=0; a<this.currentLen; a++){
            String str=this.contacts[a];
            if(str.toUpperCase().contains(find.toUpperCase())){
                return true;
            }
        }
        return false;
    }
    public String deleteContact(String delete){
        for(int b=0; b<this.currentLen; b++){
            String word=this.contacts[b];
            if(word.toUpperCase().contains(delete.toUpperCase())){
                for(;b<this.currentLen-1;b++){
                    this.contacts[b]=this.contacts[b+1];
                }
                this.currentLen--;
                break;
            }
        }
                return Arrays.toString(this.contacts);
    }
    // public String removeEmpty(String empty){
    //     for(int a=0; a<this.contacts.length; a++){
    //         String str=contacts[a];
    //         if(str.contains(empty)){
    //             contacts=str.remove(empty);
    //             return Arrays.toString(this.contacts);
    //         }
    //         else{
    //             return Arrays.toString(this.contacts);
    //         }
    //     }
    // }
    // public String removeNull(){
    //     for(int a=0; a<contacts.length; a++){
    //         for(int b=a+1; b<contacts.length; b++){
    //             int temp=contacts[a];
    //             temp=temp.indexOf("");
    //             String str=contacts[a];
    //             if(str.isEmpty()){
    //                 contacts[a]=temp;
    //                 contacts[b]=contacts[b];
    //                 temp=contacts[b];
    //             }
    //         }
    //     }
    //     return Arrays.toString(this.contacts);
    // }
}