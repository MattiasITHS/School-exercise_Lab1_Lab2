public class Monkey implements Creature, Walking {
  boolean climbing = false;

  public void makeSound() {
    System.out.println("Oook.");
  }

  public void climb() {
    System.out.print("The monkey is climbing a tree.");
    climbing = true;
  }
}
