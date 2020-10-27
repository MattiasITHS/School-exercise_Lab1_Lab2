import java.util.Scanner;

class Board{

  Scanner input = new Scanner(System.in);

  private char[][] board;
  public Board(int rowNum, int columnNum){
    this.board = new char[rowNum][columnNum];

  }

  public void show(){
    for (int i = 0; i < board.length; i++){
      System.out.print(i + "[ ]");
      for (int j = 0; j < board[i].length; j++){
	     board[i][j] = ' ';
       // System.out.println(board[i][j] + "");
     }
     System.out.print("[ ]" + i);
       System.out.println();
       //TODO få 10x10 att printa..
    }
  }
  public void set(int i, int j){

  }
  public int get(int i, int j){
    return i+j;
  }
}
