package Vehicle;

public class LandBaseVehicle{
  private int weight;
  private int value;
  private int kms;

  LandBaseVehicle(int weight, int value, int kms){
    this.weight = weight;
    this.value = value;
    this.kms = kms;
  }
  public int drive(int kms){
    return 0;
  }
}
