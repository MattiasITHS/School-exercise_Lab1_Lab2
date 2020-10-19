import java.util.Scanner;
import java.util.ArrayList;
public class SimpleDiceGame{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[]args){

    ArrayList<Player> players = initialize();
    for(int i = 0; i < players.size();i++){
      System.out.println("Players; " + players.get(i).getPlayerName());
      takeTurn(players);
    }
  }


  private static ArrayList<Player> initialize(){
    ArrayList<Player> players = new ArrayList<Player>();

    System.out.println("How many players are playing?");
    int numberOfPlayers = input.nextInt();

    System.out.println("How many dice should each player have?");
    int numberOfDice = input.nextInt();
    System.out.println("How many sides does the dice have?");
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
  //TODO printa value tot av en omgång, sum = players.get(i).getDieValue();

  private static void takeTurn(ArrayList<Player>players){
    int score;
    // !gå igenom listan med spelare
    for(int i = 0; i < players.size(); i++){
      //rulla spelarens tärning/ar
      System.out.println("Guess your score: ");
      score = input.nextInt();
      players.get(i).rollDice();
      //gissa ett värde
      //få ett värde
      System.out.println("The value of your roll are: " + players.get(i).getDieValue());

    }
  }
}
