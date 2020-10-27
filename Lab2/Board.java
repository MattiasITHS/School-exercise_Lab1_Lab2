import java.util.Scanner;

class Board{

  public static Scanner input = new Scanner(System.in);

  private char[][] board;
  public Board(int rowNum, int columnNum){
    this.board = new char[rowNum][columnNum];

  }

  public void show(){
    // System.out.println(board.length);
    for (int i = 0; i < board.length; i++){
      System.out.print(i);
      for (int j = 0; j < board[i].length; j++){
        // System.out.print();
	      board[i][j] = ' ';
        System.out.print(board[i][j] + "[ ]");
     }
      System.out.println();
    }
  }
  public void set(int i, int j){

  }
  public int get(int i, int j, char c){
    return board[i][j];
  }
  public void clear(int i, int j){

  }
  public void placeBoat(int i, int j, char orient){
    
  }
}
