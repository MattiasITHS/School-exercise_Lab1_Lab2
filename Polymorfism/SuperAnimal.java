package Polymorfism;

public class SuperAnimal{

  private String name;

  SuperAnimal(String name){
    this.name = name;
  }
  public void eat(String food){
    System.out.println(this.name + " is eating the " + food);
  }
  public String getName(){
    return name;
  }
}
