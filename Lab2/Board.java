package Lab2;
import java.util.Scanner;
public class Board {
  public static Scanner input = new Scanner(System.in);

  private final char[][] board;
  private int placeboat = 1;

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
      if (orient == 'v' || orient == 'V') {
        if(i < 0 || i > board[0].length-1|| j < 0 || j > board[0].length-1){
          System.out.println("Out of the board sir! try again!");
        } else if(i == 0 || i == board[i].length -1) {
        System.out.println("Commander, you can't place a boat here! Try again!");
        } else if (board[i][j] != ' ' || board[i+1][j] != ' ' || board[i-1][j] != ' ') {
          System.out.println("There is a boat here already commander. Try again!");
        } else {
          board[i][j] = 'o';
          board[i + 1][j] = 'o';
          board[i - 1][j] = 'o';
          placeboat++;
        }
      } else if(orient =='h'||orient =='H') {
        if (i < 0 || i > board[0].length-1|| j < 0 || j > board[0].length-1){
          System.out.println("Out of the board sir! try again!");
        } else if (j == 0 || j == board[j].length -1) {
          System.out.println("Commander, you can't place a boat here! Try again!");
        } else if (board[i][j] != ' ' || board[i][j+1] != ' ' || board[i][j-1] != ' ') {
          System.out.println("There is a boat here already commander. Try again!");
        } else {
          board[i][j] = 'o';
          board[i][j+1] = 'o';
          board[i][j-1] = 'o';
          placeboat++;
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
        if(board[row][col] == 'x'){
          System.out.print('x');
          System.out.print("]");
        } else if (board[row][col] == '.') {
          System.out.print('.');
          System.out.print("]");
        } else {
          System.out.print(" ");
          System.out.print("]");
        }
      }
      System.out.println();
    }

  }
  public int getPlaceboat() {
    return placeboat;
  }
  public void setPlaceboat(int placeboat) {
    this.placeboat = placeboat;
  }
}

//    if(i < 0 || i > board[0].length+1 || j < 0 || j > board[0].length+1 ){
//        System.out.println("Out of the board sir! try again!");
//        } else if (board[i][j] != ' ') {
//        System.out.println("There is a boat here already commander. Try again!");
//        } else if (orient == 'v' || orient == 'V') {
//        if(i == 0 || i == board[0].length -1) {
//        System.out.println("Commander, you can't place a boat here! Try again!");
//        } else if (board[i][j] == ' ' && board[i+1][j] == ' ' && board[i-1][j] == ' ') {
//        board[i][j] = 'o';
//        board[i + 1][j] = 'o';
//        board[i - 1][j] = 'o';
//        placeboat++;
//        } else {
//        System.out.println("Commander, you can't place a boat here! Try again!");
//        }
//        } else if(orient =='h'||orient =='H') {
//        if(j == 0 || j == board.length -1) {
//        System.out.println("Commander, you can't place a boat here! Try again!");
//        } else if (board[i][j] == ' ' && board[i][j+1] == ' ' && board[i][j-1] == ' ') {
//        board[i][j] = 'o';
//        board[i][j+1] = 'o';
//        board[i][j-1] = 'o';
//        placeboat++;
//        } else {
//        System.out.println("Commander, you can't place a boat here! Try again!");
//        }
//        } else {
//        System.out.println("Error! Type a V or H");
//        }
//        }