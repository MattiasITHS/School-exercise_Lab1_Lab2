package Lab2;
import java.util.Arrays;
import java.util.Scanner;
class Board {
  public static Scanner input = new Scanner(System.in);

  protected char[][] board;
  private char orient;

  public Board(int row, int col) {
    board = new char[row][col];
    for(int i = 0; i < board[0].length; i++) {
      for (int j = 0; j < board[1].length; j++) {
        board[i][j] = ' ';
      }
    }

  }

  public void show() {

    for(int i = 0; i < board[0].length; i++) {
      System.out.print("  " + i + "");
    }
    System.out.println();
    for(int row = 0; row < board[0].length; row++) {
      System.out.print(row);
      for(int col = 0; col < board[1].length; col++) {
        // Some brackets to make the box look cool

        System.out.print("[");
        System.out.print(board[row][col]);
        System.out.print("]");
      }
      System.out.println();
    }
  }

  public void setBoard(int i, int j, char c) {
    this.board[i][j] = c;
  }

  public char getBoard(int i, int j) {
    return this.board[i][j];
  }

  public void clear(int i, int j) {
    this.board[i][j] = '\0';
  }

  public void placeBoat(int i, int j, char orient) {
    /*
    *2 int värden som bestämmer vart båten placeras
    //TODO v eller h för vertikal eller horisontell placering
    placera en båt som tar upp platsen som angivits och platserna bredvid

    error om man placerar en bår där det redan finns en båt
    */
    if (board[i][j] != ' ') {
      System.out.println("There is a boat here already commander, choose another spot!");
    } else if (orient.equals("V")){
      for (int row = board[0].length; row >= 0; row--) {
        if (board[i][j] == ' ') {
          board[i][j] = 'o';
          board[i+1][j] = 'o';
          board[i-1][j] = 'o';
        }
      }
    }
  }
}