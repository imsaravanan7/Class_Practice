public class oopsConcepts_Score_9{
    public static void main(String args[]){
        Score detail=new Score();
        System.out.println(detail.toString());
        detail.getTotal();
        System.out.println("The Toatal is : "+detail.getTotal());
        detail.getAverage();
        System.out.println("The Average is : "+detail.getAverage());
        detail.getGrade();
        System.out.println("The Grade is : "+detail.getGrade());
    }
}
class Score{
    public String name;
    public int tamilMark;
    public int englishMark;
    public int frenchMark;
    public int hindiMark;

    public Score(){
        this.name="ASHIF";
        this.tamilMark=150;
        this.englishMark=160;
        this.frenchMark=170;
        this.hindiMark=180;
    }
    public Score(String name,int tamilMark,int englishMark,int frenchMark,int hindiMark){
        this.name=name;
        this.tamilMark=tamilMark;
        this.englishMark=englishMark;
        this.frenchMark=frenchMark;
        this.hindiMark=hindiMark;
    }
    public String toString(){
        String val="YOUR SCORE \n";
        val+="NAME : "+name+"\n";
        val+="TAMIL MARK : "+tamilMark+"\n";
        val+="ENGLISH MARK : "+englishMark+"\n";
        val+="FRENCH MARK : "+frenchMark+"\n";
        val+="HINDI MARK : "+hindiMark+"\n";
        return val;
    }
    public int getTotal(){
        int total=this.tamilMark+this.englishMark+this.frenchMark+this.hindiMark;
        return total;
    }
    public int getAverage(){
        int avg=this.getTotal()/4;
        return avg;
    }
    public char getGrade(){
        int grade=this.getAverage();
        if(grade<40){
            return 'F';
        }
        else if(grade>=40 && grade<=60){
            return 'D';
        }
        else if(grade>60 && grade<=70){
            return 'C';
        }
        else if(grade>70 && grade<=85){
            return 'B';
        }
        else if(grade>85 && grade<=100){
            return 'A';
        }
        else{
        return '0';
        }
    }
}