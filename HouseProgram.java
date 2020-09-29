public class HouseProgram{
  public static void main(String[]args){

    House h1 = new House(3, 100, "3 miljoner", "Cool Street 41", 1988);
    House h2 = new House(1, 57, "1 miljon", "Cool Street 42", 1989);

    PersonHouse p1 = new PersonHouse("Mattias","Studerar", 32, "Man", 188);
    PersonHouse p2 = new PersonHouse("Karl","Monör", 40, "Man", 178);
    PersonHouse p3 = new PersonHouse("Cassandra","Studerar", 26, "Kvinna", 167);


    System.out.println(h1.getAddress());
    System.out.println(h1.getFloors());
    System.out.println(h1.getValue());
    System.out.println(p1.getPersonName());
  }
}
