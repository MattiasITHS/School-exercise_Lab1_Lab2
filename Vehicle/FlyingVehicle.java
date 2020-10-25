public class FlyingVehicle extends Vehicle{
  private int weight;
  private int value;
  private int height;

  public FlyingVehicle(int weight, int value, int height){
    this.weight = weight;
    this.value = value;
    this.height = height;
  }
  public boolean fly(boolean isFlying){
    // true == ökar height, false == vill landa.
    return true;
  }

}
