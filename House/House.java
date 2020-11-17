public class House{
  // huset ska ha antal våningar, yta, värde, address och byggnadsår.
  private int floors;
  private int area;
  private int value;
  private String address;
  private int buildYear;

  public House(){

  }
  public House(int floors){
    this.floors = floors;
  }
  public House(int floors, int area, int value, String address, int buildYear){
    this.floors = floors;
    this.area = area;
    this.value = value;
    this.address = address;
    this.buildYear = buildYear;
  }
  public int getArea(){
    return this.area;
  }
  public int getFloors(){
    return this.floors;
  }
  public int getValue(){
    return this.value;
  }
  public String getAddress(){
    return this.address;
  }
  public int getBuildYear(){
    return this.buildYear;
  }
  public void setArea(int area){
    this.area = area;
  }
}
