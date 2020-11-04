package Lab2;

import java.util.Scanner;

public class BattleShip{
  public static Scanner input = new Scanner(System.in);
  final static int rowNum = 10;
  final static int colNum = 10;
  public static void main (String[] args){


//    Board [][]board = new Board[rowNum][colNum];
//    Board [][]board1 = new Board[rowNum][colNum];
    Board b = new Board(rowNum,colNum);
    Board b1 = new Board(rowNum,colNum);



    System.out.println("Player 1 turn");
    b = initialize();
      System.out.println("Player 2 turn.");
    b1 = initialize();

    b.show();
    b1.show();
//    if(checkWinner(b)){
//        System.out.println("Congrats! you've won the battle!");
//    } else if(!checkWinner(b)){
//        turn(b1);
//    }

    System.out.println("Player 1's turn");
    turn(b1);
    System.out.println("Player 2's turn");
    turn(b);

  }
  public static boolean turn(Board target){

    Canon c = new Canon();
    target.show();
    System.out.println("Choose where to fire the canon!");
    System.out.print("Row: ");
    int fireRow = input.nextInt();
    System.out.print("Column ");
    int fireCol = input.nextInt();

    c.fire(fireRow,fireCol,target);
    target.show();
    if(!c.fire(fireRow, fireCol, target)){
        return false;
    } else {
        return true;
    }
  }

  private static Board initialize(){
    int placebo = 1;
    Board board = new Board(rowNum,colNum);
    while(placebo <= 2){
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
        if (board.getBoard(row,col) == 'o') {
            placebo++;
        }
    }
    board.show();
    return board;
  }
  private static boolean checkWinner(Board board){

      /*
      tar emot ett bräde och undersöker om alla skepp har sänkts
      returnera true om alla skepp har sänkts, annars false.
       */
      return board.getBoard(rowNum, colNum) == 0;

  }

}
