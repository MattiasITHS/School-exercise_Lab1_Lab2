import java.util.Scanner;

class Board{

  public static Scanner input = new Scanner(System.in);

  private char[][] board;
  public Board(int row, int col){
    this.board = new char[row][col];

  }

  public void show(){
    for (int row = 0; row < board.length+1; row++){ // +1 för att skapa en extra rad
      if(row == 0){
        System.out.print(" ");
      } else {
        System.out.print(row-1);
      }
      for (int col = 0; col < board.length; col++){
        if(row == 0){
          System.out.print("  " + col + " ");
        } else {
          board[row-1][col] = ' ';
          System.out.print(board[row-1][col] + "[ ]");
        }
     }
      System.out.println();
    }
  }
  public void setBoard(int i, int j){

  }
  public int getBoard(int i, int j, char c){
    return board[i][j] + c;
  }
  public void clear(int i, int j){
    for (int row = 0; row < board.length;row++){
      for(int col = 0; col < board[i].length;col++){
        board[row][col] = 0;
      }
    }
  }
  public void placeBoat(int i, int j, char orient){
    i = input.nextInt();
    j = input.nextInt();
    // orient = input.next();
  }
}
