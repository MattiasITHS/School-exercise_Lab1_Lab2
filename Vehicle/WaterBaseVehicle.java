public class WaterBaseVehicle extends Vehicle{
  private int weight;
  private int value;
  private int gpsLong;
  private int gpdLat;

  public WaterBaseVehicle(int weight, int value, int gpsLong, int gpsLat){
    this.weight = weight;
    this.value = value;
    this.gpsLong = gpsLong;
    this.gpsLat = gpsLat;
  }

}
