public class DieGame{
  public static void main(String[]args){
    Player player1 = new Player("Mattias");
    player1.addDie(6);
    player1.addDie(6);
    player1.addDie(8);
    player1.rollDice();
    System.out.println("Value of dices: " + player1.getDieValue());
    player1.increaseScore();
    System.out.println("Score: " + player1.getScore());
  }
}
