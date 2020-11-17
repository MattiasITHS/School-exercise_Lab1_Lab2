public class Flyfish implements Creature, Flying, Aquatic {
  boolean submerged = false;
  boolean flying = false;

  public void makeSound() {
    System.out.println("Splash!");
  }

  public void dive() {
    System.out.println("The flyfish dives under the surface.");
    submerged = true;
    flying = false;
  }

  public void liftOff() {
    System.out.println("The flyfish takes flight and flies for a bit.");
    flying = true;
    submerged = false;
  }
}
