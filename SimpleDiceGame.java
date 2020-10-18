import java.util.Scanner;
import java.util.ArrayList;
public class SimpleDiceGame{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[]args){

    ArrayList<Player> names = initialize();

    System.out.println(names);


  }
  private static ArrayList<Player> initialize(){

    String name;
    ArrayList<Player> names = new ArrayList<Player>();
    ArrayList<Die> dice = new ArrayList<Die>();

    System.out.println("How many players are playing?");
    int numberOfPlayers = input.nextInt();

    System.out.println("How many dice should each player have?");
    int numberOfDice = input.nextInt();
      for(int i = 0; i < dice.size();i++){
          dice.add(new Die(6));
        }

    System.out.println("Whats the name of the players?");
    for(int i = 0; i <= numberOfPlayers; i++){
      name = input.nextLine();
      names.add(new Player(name));
    }
    return (names);
  }

  private static void takeTurn(ArrayList<Player>players){
    ArrayList<Player> names = new ArrayList<Player>();

      for(int i = 0; i < names.size(); i++){
        System.out.println(names.get(i).getPlayerName());
      //   for (int k = 0; k < dice.size(); k++){
      //
      // }
    }
  }
}
