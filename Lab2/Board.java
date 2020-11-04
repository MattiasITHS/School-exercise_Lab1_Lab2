package Lab2;
import java.util.Scanner;
public class Board {
  public static Scanner input = new Scanner(System.in);

  private char[][] board;
  private int placebo = 1;

  public Board(int row, int col) {
    board = new char[row][col];
    for (int i = 0; i < board[0].length; i++) {
      for (int j = 0; j < board[1].length; j++) {
        board[i][j] = ' ';
      }
    }
  }

  public void show() {
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

  public void setBoard(int i, int j, char c) {
    board[i][j] = c;
  }

  public char getBoard(int i, int j) {
    return board[i][j];
  }

  public void clear(int i, int j) {
    board[i][j] = '\0';
  }


  public void placeBoat(int i, int j, char orient) {
    if (board[i][j] != ' ') {
      System.out.println("There is a boat here already commander.");
    } else if (i == 0 || i == board[0].length - 1 || j == 0 || j == board[0].length - 1) {
      System.out.println("Commander, you can't place a boat here!");
    } else if (orient == 'v' || orient == 'V') {
     if (board[i][j] == ' ') {
      board[i][j] = 'o';
      board[i + 1][j] = 'o';
      board[i - 1][j] = 'o';
      placebo++;
    }
    } else if(orient =='h'||orient =='H'){
      if (board[i][j] == ' ') {
      board[i][j] = 'o';
      board[i][j+1] = 'o';
      board[i][j-1] = 'o';
      placebo++;
      }
    } else {
      System.out.println("Error! Type a V or H");
    }
  }
  public void showFog(){
    for (int i = 0; i < board[0].length; i++) {
      System.out.print("  " + i + "");
    }
    System.out.println();
    for (int row = 0; row < board[0].length; row++) {
      System.out.print(row);
      for (int col = 0; col < board[1].length; col++) {
        System.out.print("[");
        System.out.print(" ");
        System.out.print("]");
        // TODO mata in 'x' när båt har blivit träffat
      }
      System.out.println();
    }
  }
  public int getPlacebo() {
    return placebo;
  }
  public void setPlacebo(int placebo) {
    this.placebo = placebo;
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
