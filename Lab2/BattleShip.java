package Lab2;

import java.util.Scanner;

public class BattleShip{
  public static Scanner input = new Scanner(System.in);
    final static int rowNum = 10;
    final static int colNum = 10;
  public static void main (String[] args){


    char[][] board = new char[rowNum][colNum];

    Board b = new Board(board);
    Board b1 = new Board(board);
      char[][] b3 = new char[rowNum][colNum];

//    Board b = new Board(10,10);
//    Board b1 = new Board(10,10);




    System.out.println("Player 1 turn");
    b = initialize();
    System.out.println("Player 2 turn.");


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
    Board.show();
    System.out.println("Choose where to fire the canon!");
    System.out.print("Row: ");
    int fireRow = input.nextInt();
    System.out.print("Column ");
    int fireCol = input.nextInt();

    c.fire(fireRow,fireCol,target);
    Board.show();
    if(!c.fire(fireRow, fireCol, target)){
        return false;
    } else {
        return true;
    }
  }

  private static Board initialize(){
// TODO placera ut rätt antal båtar.
    int placebo = 1;
    Board board = new Board(rowNum,colNum);
    while(placebo <= 1){
        Board.show();
        System.out.println("Commander! place 4 ships");
        System.out.print("Row: ");
        int row = input.nextInt();
        System.out.print("Column: ");
        int col = input.nextInt();
        System.out.print("Orientation of your ship(v for vertical, h for horizontal): ");
        char orient = input.next().charAt(0);
        Board.placeBoat(row, col, orient);
        if(board.getBoard(row,col) == ' ') {
            System.out.println("Try again!");
        }
        if (board.getBoard(row,col) == 'o') {
            placebo++;
        }
    }
    Board.show();
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
