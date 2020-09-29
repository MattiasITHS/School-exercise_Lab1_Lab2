public class House{
  // huset ska ha antal våningar, yta, värde, address och byggnadsår.
  private int floors;
  private int area;
  private String value;
  private String address;
  private int buildYear;
  public House(int f, int a, String v, String ad, int by){
    floors = f;
    area = a;
    value = v;
    address = ad;
    buildYear = by;
  }
  public int getArea(){
    return area;
  }
  public int getFloors(){
    return floors;
  }
  public String getValue(){
    return value;
  }
  public String getAddress(){
    return address;
  }
  public int getBuildYear(){
    return buildYear;
  }
}
