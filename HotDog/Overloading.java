package HotDog;
public class Overloading{
  public static void main(String[]args){

    hej("Mattias");
    hej(6);
    hej();

    Person p1 = new Person("Mattias","hovde", 32);

    System.out.println(p1.getAge());
    System.out.println(p1.SPIECIES);

    Book b1 = p1.writeBook("The Shining, the sequel: Let there be more");
    System.out.println(b1);
  }

  public static void hej(String name){
    System.out.println("Hej " + name + "!");
  }
  public static void hej(int nummer){
    System.out.println("HEJ nummer " + nummer + "!");
  }
  public static void hej(){
    System.out.println("Hej du!");
  }
}
