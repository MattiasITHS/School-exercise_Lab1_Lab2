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
      dices.get(i).roll();
    }
  }

  public int getDieValue(){
    int sum = 0;
    for(int i = 0; i < dices.size();i++){
      sum = sum + dices.get(i).getValue(); //+= istället för sum = sum
    }
    return sum;
  }

  public void increaseScore(){
    this.score++;
  }

  public void addDie(int sides){
    dices.add(new Die(sides));
  }
}
