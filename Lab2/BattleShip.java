package Lab2;

import java.util.Scanner;

public class BattleShip{
  public static Scanner input = new Scanner(System.in);
  public static void main (String[] args){

    Board b = new Board(10,10);
<<<<<<< HEAD
    // Board b1 = new Board(10,10);
=======
    Board b1 = new Board(10,10);
    Canon c = new Canon();
>>>>>>> e775856614762e1967954003cc6156ab32b83a99

    System.out.println("Player 1 turn");
    b = initialize();
    System.out.println("Player 2 turn.");
    b1 = initialize();

    do{
        System.out.println("Player 1's turn");
        turn(b1);
    }while(!turn(b1));
//    do{
//        System.out.println("Player 2's turn");
//        turn(b1);
//    }while(!turn(b));


<<<<<<< HEAD
    b.placeBoat(row,col,orient);
    b.show();
    // turn(b);
=======
>>>>>>> e775856614762e1967954003cc6156ab32b83a99

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
<<<<<<< HEAD
   public static void turn(Board target){
    /*
    b.show(); visa brädet som skall beskjutas.
    fråga vart spelare ska skjuta, 2 inputs
    mata in 2 inputs
    använda instans av klassen canon för att skjuta Board med metod fire();
    visa brädet
    returnera en boolean med true == träff, false == miss.
     */


   }
=======
  private static Board initialize(){
// TODO placera ut rätt antal båtar.
      
    Board board = new Board(10,10);
    Board.placeBoat = 2;
    for(int i = 0; i < Board.placeBoat; i++){
        Board.show();
        System.out.println("Commander! place 4 ships");
        System.out.print("Row: ");
        int row = input.nextInt();
        System.out.print("Column: ");
        int col = input.nextInt();
        System.out.print("Orientation of your ship(v for vertical, h for horizontal): ");
        char orient = input.next().charAt(0);
        Board.placeBoat(row, col, orient);
    }
    Board.show();
    return board;
  }
  private static boolean checkWinner(Board board){
      /*
      tar emot ett bräde och undersöker om alla skepp har sänkts
      returnera true om alla skepp har sänkts, annars false.
       */
      return Board.placeBoat == 0;
  }
>>>>>>> e775856614762e1967954003cc6156ab32b83a99
}
