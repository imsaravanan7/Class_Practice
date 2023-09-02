import java.util.*;

public class Multi_Array_move{
    public static char board[][]={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
    public static Scanner scan=new Scanner (System.in);
    public static void main(String args[]){
        char player='X';
    for(int i=0;i<9;i++){

        move(player);
        player=swap(player);

    }
   
    }
    public static void move(char play){
        int num=scan.nextInt();

        switch(num){
            case 1:
                board[0][0]=play;
                display();
                break;
            case 2:
                board[0][1]=play;
                display();
                break;
            case 3:
                board[0][2]=play;
                display();
                break;
            case 4:
                board[1][0]=play;
                display();
                break;
            case 5:
                board[1][1]=play;
                display();
                break;
            case 6:
                board[1][2]=play;
                display();
                break;
            case 7:
                board[2][0]=play;
                display();
                break;
            case 8:
                board[2][1]=play;
                display();
                break;
            case 9:
                board[2][2]=play;
                display();
                break;
        }
  
    }
    public static void display(){
        for(int i=0; i<board.length; i++){
            System.out.print("|\t");
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+"\t|\t");
            }
            System.out.println();
        }
    }
    public static char swap(char play){
        if(play=='X'){
            play='O';
            return play;
        }
        else {
            play='X';
            return play;
        }
    }
    public static void congra(char win){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
        if((board[i][j]==win&&board[i][j]==win)&&board[i][j]==win){
        }
    }
    }
    }
}