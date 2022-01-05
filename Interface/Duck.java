package Interface;

public class Duck implements Creature, Flying, Aquatic, Walking {
  boolean climbing = false;
  boolean submerged = false;
  boolean flying = false;
  
  public void makeSound() {
    System.out.println("Quack!");
  }

  public void climb() {
    System.out.print("The duck is climbing a branch.");
    climbing = true;
    submerged = false;
    flying = false;
  }

  public void dive() {
    System.out.println("The duck dives under the surface.");
    submerged = true;
    climbing = false;
    flying = false;
  }

  public void liftOff() {
    System.out.println("The duck takes flight and soars away.");
    flying = true;
    climbing = false;
    submerged = false;
  }
}
