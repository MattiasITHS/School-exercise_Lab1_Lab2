public class PersonHouse{
  private String name;
  private String job;
  private int age;
  private String gender;
  private int length;
  private House house;
  public PersonHouse(String name, String job, int age, String gender, int length, House house){
    this.name = name;
    this.job = job;
    this.age = age;
    this.gender = gender;
    this.length = length;
    this.house = house;
  }

  public String getPersonName(){
    return this.name;
  }
  public House getHouse(){
    return this.house;
  }
  public String toString(){
    return this.name + " " + this.job + " " + this.age + " " + this.gender + " " + this.length;
  }
}
