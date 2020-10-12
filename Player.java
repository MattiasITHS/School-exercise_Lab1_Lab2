import java.util.ArrayList;

public class Player{

  private String name;
  private int score;
  ArrayList<Die> dices = new ArrayList<Die>();

  public Player(String name){
    this.name = name;
  }

  public String getPlayerName(){
    return this.name;
  }

  public int getScore(){
    return this.score;
  }

  public void rollDice(){
    for(int i = 0; i < dices.size();i++){
      //ska rulla alla tärningar i spelarens tärningslista.....
      dices.get(i).roll();
    }
  }

  public int getDieValue(){
    int sum = 0;
    for(int i = 0; i < dices.size();i++){
      // addera tärning med tärning
      sum = sum + dices.get(i).getValue(); // sum+= lägger till, = ersätter
    }
    return sum;
  }

  public void increaseScore(){
    this.score++;
    // ökar score med 1 om en spelare vinner
  }

  public void addDie(int sides){
    // Skapar ny tärning med sidor och lägger till den till spelaren.
    dices.add(new Die(sides));
  }
}
