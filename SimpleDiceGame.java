import java.util.Scanner;
import java.util.ArrayList;
public class SimpleDiceGame{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[]args){

    ArrayList<Player> players = initialize();
    for(int i = 0; i < players.size();i++){
      System.out.println("Players; " + players.get(i).getPlayerName());
    }

//TODO takeTurn, spelare 1, gissa värde, rulla tärning, få ett värde, stämmer gissning med värdet på tärning == vinst
  }


  private static ArrayList<Player> initialize(){
    ArrayList<Player> players = new ArrayList<Player>();

    System.out.println("How many players are playing?");
    int numberOfPlayers = input.nextInt();

    System.out.println("How many dice should each player have?");
    int numberOfDice = input.nextInt();
    System.out.println("How many sides shall the dice have?");
    int numberOfSides = input.nextInt();

    System.out.println("Whats the name of the players?");
    for(int i = 0; i < numberOfPlayers; i++){
      players.add(new Player(input.next()));
      for(int j = 0; j < numberOfDice;j++){
        players.get(i).addDie(numberOfSides);
      }
    }
    return players;
  }

  private static void takeTurn(ArrayList<Player>players){
      for(int i = 0; i < players.size(); i++){
      //   for (int k = 0; k < dice.size(); k++){
      //
      // }
    }
  }
}
