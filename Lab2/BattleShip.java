import java.util.Scanner;

public class BattleShip{
  public static Scanner input = new Scanner(System.in);
  public static void main (String[] args){

    Board b = new Board(10,10);
    b.show();

  }
}
