public class Person{
  private String name;
  private int age;
  private String job;
  private int bankMoney;

  public Person(String name, int age, String job, int bankMoney){
    this.name = name;
    this.age = age;
    this.job = job;
    this.bankMoney = bankMoney;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getJob(){
    return job;
  }
  public int getBankMoney(){
    return bankMoney;
  }

}
