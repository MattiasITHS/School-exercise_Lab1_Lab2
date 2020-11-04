package Lab2;
import java.util.Scanner;
public class Board {
  public static Scanner input = new Scanner(System.in);

  private static char[][] board;

  public Board(int row, int col) {
<<<<<<< HEAD
    board = new char[row][col];
    for (int i = 0; i < board[0].length; i++) {
=======
    this.board = new char[row][col];
    for(int i = 0; i < board[0].length; i++) {
>>>>>>> c33e1aa12af84b292ccba695341120251ca12574
      for (int j = 0; j < board[1].length; j++) {
        board[i][j] = ' ';
      }
    }
  }
  public Board(char[][] board) {
    Board.board = board;
  }

  public static void show() {

    for (int i = 0; i < board[0].length; i++) {
      System.out.print("  " + i + "");
    }
    System.out.println();
    for (int row = 0; row < board[0].length; row++) {
      System.out.print(row);
      for (int col = 0; col < board[1].length; col++) {
        System.out.print("[");
        System.out.print(board[row][col]);
        System.out.print("]");
      }
      System.out.println();
    }
  }

  public static void setBoard(int i, int j, char c) {
    board[i][j] = c;
  }

  public static char getBoard(int i, int j) {
    return board[i][j];
  }

  public void clear(int i, int j) {
    board[i][j] = '\0';
  }

<<<<<<< HEAD
  public void placeBoat(int i, int j, char orient) {

  if (board[i][j] != ' ') {
    System.out.println("There is a boat here already commander.");
  } else if (orient == 'v' || orient == 'V') {
=======
  public static void placeBoat(int i, int j, char orient) {

    if (board[i][j] != ' ') {
      System.out.println("There is a boat here already commander.");
<<<<<<< HEAD
    } else if (i == 0 || i == board[0].length - 1 || j == 0 || j == board.length - 1) {
        System.out.println("Commander, you can't place a boat here!");
    } else if (orient == 'v' || orient == 'V') {
      if (board[i][j] == ' ') {
=======
    } else if (orient == 'v' || orient == 'V') {
>>>>>>> e775856614762e1967954003cc6156ab32b83a99
      if (i == 0 || i == board[0].length -1){
        System.out.println("Commander, you can't place a boat here!");
      } else if (board[i][j] == ' ') {
          board[i][j] = 'o';
          board[i + 1][j] = 'o';
          board[i - 1][j] = 'o';
      }
    } else if (orient == 'h' || orient == 'H') {
        if(j == 0 || j == board.length -1){
          System.out.println("Commander, you can't place a boat here!");
      }   else if (board[i][j] == ' ') {
>>>>>>> c33e1aa12af84b292ccba695341120251ca12574
        board[i][j] = 'o';
        board[i + 1][j] = 'o';
        board[i - 1][j] = 'o';
      }
    } else if (orient == 'h' || orient == 'H') {
      if (board[i][j] == ' ') {
        board[i][j] = 'o';
        board[i][j + 1] = 'o';
        board[i][j - 1] = 'o';
      }
    }
  }

}
//      if (board[i][j] != ' ') {
//        System.out.println("There is a boat here already commander.");
//      } else if (orient == 'v' || orient == 'V') {
//        if (i == 0 || i == board[0].length -1){
//          System.out.println("Commander, you can't place a boat here!");
//        } else if (board[i][j] == ' ') {
//          board[i][j] = 'o';
//          board[i+1][j] = 'o';
//          board[i-1][j] = 'o';
//          }
//      } else if (orient == 'h' || orient == 'H') {
//        if(j == 0 || j == board.length -1){
//          System.out.println("Commander, you can't place a boat here!");
//        } else if (board[i][j] == ' ') {
//          board[i][j] = 'o';
//          board[i][j + 1] = 'o';
//          board[i][j - 1] = 'o';
//          }
//        }
