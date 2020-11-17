public class Rat implements Mortal{
  private int health = 1;

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
