package Rep;

public class Worm implements Animal {
  public void makeSound() {
    System.out.println("Digging sound.");
  }

  public void eat(String food) {
    System.out.println("The worm crawls through " + food + " and eats it.");
  }
}
