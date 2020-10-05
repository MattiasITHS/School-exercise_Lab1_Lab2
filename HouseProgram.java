public class HouseProgram{
  public static void main(String[]args){

    CarHouse car1 = new CarHouse("Volvo", 500000, 20000);
    CarHouse car2 = new CarHouse("Saab", 50000, 25000);

    House h1 = new House(3, 100, 3000000, "Cool Street 41", 1988);
    House h2 = new House(1, 57, 1000000, "Cool Street 42", 1989);
    House h3 = new House(3);
    House h4 = new House();
    h4.setArea(55);

    PersonHouse p1 = new PersonHouse("Mattias","Studerar", 32, "Man", 188, h1);
    PersonHouse p2 = new PersonHouse("Karl","Montör", 40, "Man", 178, h1);
    PersonHouse p3 = new PersonHouse("Cassandra","Studerar", 26, "Kvinna", 167, h2);


    // p1.getHouse().getAddress();

    System.out.println(h1.getAddress());
    System.out.println(h1.getFloors());
    System.out.println(h1.getValue());
    System.out.println(p1.getHouse().getAddress());
    System.out.println(h4.getArea());

  }
}
