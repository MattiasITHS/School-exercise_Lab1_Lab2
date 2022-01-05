package Interface;

import Interface.Mortal;

public class Dragon implements Monster, Mortals {
  private int health = 100;
   public void attack() {
    System.out.println("The dragon unleashes a ferocious roar");
    breatheFire();
  }

  public int getHealth() {
    return health;
  }

  public void incHealth(int heal) {
    health += heal;
  }

  public void breatheFire() {
    System.out.println("The dragon covers the ground in flames!");
  }

  public void damage(int dmg) {
    health -= dmg;
  }
}
