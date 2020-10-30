package Lab2;

import java.util.Scanner;

public class BattleShip{
  public static Scanner input = new Scanner(System.in);
  public static void main (String[] args){


    Board b = new Board(10,10);
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

  }
}
