public abstract class Mortal implements Caller {
  private int health;

  public Mortal(int health) {
    this.health = health;
  }

  public int getHealth() {
    return health;
  }

  public void incHealth(int heal) {
    health += heal;
  }

  public void damage(int dmg) {
    health -= dmg;
  }
}
