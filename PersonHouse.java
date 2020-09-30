public class PersonHouse{
  private String name;
  private String job;
  private int age;
  private String gender;
  private int length;
  private House house;
  public PersonHouse(String n, String j, int a, String g, int l, House h){
    name = n;
    job = j;
    age = a;
    gender = g;
    length = l;
    house = h;
  }

  public String getPersonName(){
    return name;
  }
  public House getHouse(){
    return house;
  }
}
