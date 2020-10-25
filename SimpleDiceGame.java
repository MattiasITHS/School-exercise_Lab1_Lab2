import java.util.Scanner;
import java.util.ArrayList;


public class SimpleDiceGame{
  final static int GAME_ROUNDS = 5;
  public static Scanner input = new Scanner(System.in);
  public static void main(String[]args){

    ArrayList<Player> players = initialize();

    for(int i = 0; i < GAME_ROUNDS; i++){
      takeTurn(players);
    }
    for (int i = 0; i < players.size(); i++){
      System.out.println(players.get(i).getPlayerName() + " scores are " + players.get(i).getScore());
    }
    for(int i = 0; i < players.size();i++){
      getWinners(players);
    }
    for(int i = 0; i < players.size(); i++){
      if(players.size() > 1){
      System.out.println("The winners: " + players.get(i).getPlayerName());
    }else if (players.size() < 2){
      System.out.println("The winner is: " + players.get(i).getPlayerName());
    }
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

  private static void takeTurn(ArrayList<Player>players){
    int guessScore;
    for(int i = 0; i < players.size(); i++){
      System.out.println("Player; " + players.get(i).getPlayerName());

      System.out.println(players.get(i).getPlayerName() + " guess your score: ");
      guessScore = input.nextInt();

      players.get(i).rollDice();
      System.out.println("The value of your roll are: " + players.get(i).getDieValue());

      if(guessScore==players.get(i).getDieValue()){
        System.out.println("SCOOOOOOORE!");
        players.get(i).increaseScore();
      } else {
        System.out.println("No score this round!");
      }
    }
  }
  private static ArrayList<Player> getWinners(ArrayList<Player> players){

    for(int i = 0; i < players.size()-1; i++){
      int score = players.get(i).getScore();
      if(score > players.get(i+1).getScore()){
        players.remove(players.get(i+1));
      } else if(score < players.get(i+1).getScore()){
        players.remove(players.get(i));
        }
    }
    return players;
  }
}
