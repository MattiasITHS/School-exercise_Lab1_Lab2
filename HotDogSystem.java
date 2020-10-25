public class HotDogSystem{
  public static void main(String[]args){
    Person p1 = new Person("Mattias","Hovde",31,true);
    Person p2 = new Person("Pierre","Alberto",30,false);
    Person p3 = new Person("Carolina","Hovde",30,true);

//     p2.firstName = "Peirre";
//     p2.lastName = "Alberto";
//     p2.age = 30;
//     p2.hungry = true;
//
//     p3.firstName = "Carolina";
//     p3.lastName = "Hovde";
//     p3.age = 30;
//     p3.hungry = true;

    HotDogStand h1 = new HotDogStand();
    h1.hotDogsLeft = 2;
    h1.feedPerson(p1);
    System.out.println(p1.hungry);
    h1.feedPerson(p2);
    h1.feedPerson(p3);
    System.out.println(p3.hungry);
  }
}
