package Rep;

public abstract class Pets implements Animal {
  private String home;

  public abstract void makeSound();

  public void eat(String food) {
    System.out.println("The animal eats some " + food + ".");
  }

  public void setHome(String home) {
    this.home = home;
  }

  public String getHome() {
    return home;
  }
}
