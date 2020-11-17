public class Human implements Creature, Walking, Aquatic {
  boolean climbing = false;
  boolean submerged = false;
  
  public void makeSound() {
    System.out.println("Hello, anyone there?");
  }

  public void climb() {
    System.out.print("The human is climbing a mountainside.");
    climbing = true;
    submerged = false;
  }

  public void dive() {
    System.out.println("The human dives under the surface.");
    submerged = true;
    climbing = false;
  }
}
