package Lab2;
import java.util.Arrays;
import java.util.Scanner;
class Board{
  public static Scanner input = new Scanner(System.in);

  private int col;
  private int row;
  private char[][] board;
  private char orient;

  public Board(int row, int col){
    this.col = col;
    this.row = row;
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
  public void setBoard(int i, int j, char c){
    this.row = i;
    this.col = j;
    this.orient = 'o';

  }
  public int getBoard(int i, int j){
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
    return board[i][j];
  }
  public void clear(int i, int j){
    for (int row = 0; row < board.length;row++){
      for(int col = 0; col < board[i].length;col++){
        board[row][col] = 0;
      }
    }
  }
  public void placeBoat(int i, int j, char orient){
    //2 int värden som bestämmer vart båten placeras
    //v eller h för vertikal eller horisontell placering
    //placera en båt som tar upp platsen som angivits och platserna bredvid
    // error om man placerar en bår där det redan finns en båt
    for(i = 0; i < board.length; i++){
      for(j = 0; j < board.length;j++){
        board[i][j] = orient;
      }
    }

  }
}
