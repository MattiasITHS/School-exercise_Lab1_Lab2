public class CarHouse{
  private String brand;
  private int value;
  private int kmCounter;

  public CarHouse(String brand, int value, int kmCounter){
  this.brand = brand;
  this.value = value;
  this.kmCounter = kmCounter;
  }
  public String toString(){
    return brand + " " + value + " " + kmCounter;
  }
}
