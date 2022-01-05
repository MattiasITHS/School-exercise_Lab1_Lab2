package Interface;

public class InterfaceCreatures {
  public static void main(String[]args) {
    Human h1 = new Human();
    Duck d1 = new Duck();
    Monkey m1 = new Monkey();
    Flyfish f1 = new Flyfish();

    creatureSound(h1);
    creatureSound(d1);
    creatureSound(m1);
    creatureSound(f1);

  }

  public static void creatureSound(Creature c) {
    c.makeSound();
  }
}
