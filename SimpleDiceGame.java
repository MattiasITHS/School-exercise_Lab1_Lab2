import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleDiceGame{
  final static int GAME_ROUNDS = 5;
  public static Scanner input = new Scanner(System.in);
  public static void main(String[]args){
    ArrayList<Player> players = initialize();
    for(int i = 0; i < 2;i++){
      takeTurn(players);
    }
    for(int i = 0; i < players.size();i++){
      getWinners(players);
      System.out.println(players.get(i).getPlayerName() + " score: " + players.get(i).getScore());
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
    // !gå igenom listan med spelare
    for(int i = 0; i < players.size(); i++){
      //!rulla spelarens tärning/ar
      //!gissa ett värde
      System.out.println("Player; " + players.get(i).getPlayerName());
      System.out.println(players.get(i).getPlayerName() + " guess your score: ");
      guessScore = input.nextInt();
      players.get(i).rollDice();
      //!få ett värde
      System.out.println("The value of your roll are: " + players.get(i).getDieValue());
      // öka spelarens poäng om gissning är rätt
      if(guessScore==players.get(i).getDieValue()){
        System.out.println("SCOOOOOOORE!");
        players.get(i).increaseScore();
      } else {
        System.out.println("No score this round!");
      }
    }
  }
  private static ArrayList<Player> getWinners(ArrayList<Player>players){
    //ta emot listan
    // returnera lista med vinnare
    ArrayList<Player> winners = new ArrayList<Player>();
    int maxScore = -1; //Assuming it is not possible to have negative points

    for (int i = 0; i < players.size(); i++){
      int score = players.get(i).getScore();
      if (score >= maxScore) {
        if (score > maxScore) {
            winners.clear();
          }
        maxScore = score;
        winners.add(players.get(i));
      }
    // vinnare == mest poäng
      // jämföra poäng mellan spelare i arraylistan??
    // lista kan innehålla fler vinnare, lika många poäng
    }
    return winners;
  }
}
