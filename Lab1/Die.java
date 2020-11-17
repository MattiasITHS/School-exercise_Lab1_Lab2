import java.util.Random;
public class Die{
  private int value = 0;
  private int numberOfSides;
  private static Random generateRandom = new Random();
  Die(int numberOfSides){
    this.numberOfSides = numberOfSides;
  }
  public int getValue(){
    return this.value;
  }
  public int getNumberOfSides(){
    return this.numberOfSides;
  }
  public void roll(){
    this.value = generateRandom.nextInt(this.numberOfSides)+1;
    System.out.println(this.value);
  }
}
