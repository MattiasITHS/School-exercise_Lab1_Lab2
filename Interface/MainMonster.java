public class MainMonster {
  public static void main(String[]args) {
    Dragon d1 = new Dragon();
    Rat r1 = new Rat();
    Ghost g1 = new Ghost();

    fight(d1);
    //fight(r1);
    fight(g1);

    heal(d1);
    heal(r1);
    //heal(g1);
  }

  public static void fight(Monster mon) {
    System.out.println("An enemy appears!");
    mon.attack();
    System.out.println();
  }

  public static void heal(Mortal mor) {
    mor.incHealth(50);
    System.out.println("This mortal now has " + mor.getHealth() + " health.");
    System.out.println();
  }
}
