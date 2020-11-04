package Lab2;

import java.util.Scanner;

public class BattleShip{
  public static Scanner input = new Scanner(System.in);
  final static int rowNum = 10;
  final static int colNum = 10;
  public static void main (String[] args){
    boolean fireHit = true;

    Board b = new Board(rowNum,colNum);
    Board b1 = new Board(rowNum,colNum);



    System.out.println("Player 1 turn");
    b = initialize();
      System.out.println("Player 2 turn.");
    b1 = initialize();

    System.out.println("Player 1's turn");
    while(turn(b1)){
        System.out.println("Fire again commander!");
        turn(b1);
        if(!turn(b1)){
            break;
        }
    }




    System.out.println("Player 2's turn");
    turn(b);

  }
  public static boolean turn(Board target){

    Canon c = new Canon();
    target.showFog();
    System.out.println("Choose where to fire the canon!");
    System.out.print("Row: ");
    int fireRow = input.nextInt();
    System.out.print("Column ");
    int fireCol = input.nextInt();

    c.fire(fireRow,fireCol,target);
    target.showFog();
      return c.fire(fireRow, fireCol, target);
  }

  private static Board initialize(){
    Board board = new Board(rowNum,colNum);
    while(board.getPlacebo() <= 1){
        board.show();
        System.out.println("Commander! place 4 ships");
        System.out.print("Row: ");
        int row = input.nextInt();
        System.out.print("Column: ");
        int col = input.nextInt();
        System.out.print("Orientation of your ship(v for vertical, h for horizontal): ");
        char orient = input.next().charAt(0);

        board.placeBoat(row, col, orient);

        if(board.getBoard(row,col) == ' ') {
            System.out.println("Try again!");
        }
    }
    board.show();
    return board;
  }
  private static boolean checkWinner(Board board){

      return false;

  }

}
