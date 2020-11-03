package Lab2;

import java.util.Scanner;

public class BattleShip{
  public static Scanner input = new Scanner(System.in);
  public static void main (String[] args){

    Board b = new Board(10,10);
    // Board b1 = new Board(10,10);

    b.show();

    System.out.println("Place your ship commander");
    System.out.print("Row: ");
    int row = input.nextInt();
    System.out.print("Column: ");
    int col = input.nextInt();
    System.out.print("Orientation of your ship(v for vertical, h for horizontal): ");
    char orient = input.next().charAt(0);

    b.placeBoat(row,col,orient);
    b.show();
    // turn(b);

    System.out.println("Choose where to fire the canon!");
    System.out.print("Row: ");
    int fireRow = input.nextInt();
    System.out.print("Column ");
    int fireCol = input.nextInt();
    Canon c = new Canon();
    c.fire(fireRow,fireCol,b);
    b.show();

  }
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
}
