public class PersonHouse{
  private String name;
  private String job;
  private int age;
  private String gender;
  private int length;
  public PersonHouse(String n, String j, int a, String g, int l){
    name = n;
    job = j;
    age = a;
    gender = g;
    length = l;
  }
  public String getPersonName(){
    return name;
  }  
}
