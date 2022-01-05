package House;

public class PersonHouse{
  private String name;
  private String job;
  private int age;
  private String gender;
  private int length;
  private House house;
  private CarHouse car;
  public PersonHouse(String name, String job, int age, String gender, int length, House house, CarHouse car){
    this.name = name;
    this.job = job;
    this.age = age;
    this.gender = gender;
    this.length = length;
    this.house = house;
    this.car = car;
  }

  public String getPersonName(){
    return this.name;
  }
  public House getHouse(){
    return this.house;
  }
  public CarHouse getCar(){
    return this.car;
  }
  public String toString(){
    return this.name + " " + this.job + " " + this.age + " " + this.gender + " " + this.length;
  }
}
