package ComputerWinMac;

public class ComputerMain{
  public static void main(String[]args){
    Computer c = new Computer();
    PC p1 = new PC();
    Macintosh m1 = new Macintosh();
    p1.printYourInventor();
    m1.printYourInventor();
    Computer p2 = new PC(); // override, kompilerar som Computer, körs som PC
    Computer m2 = new Macintosh();
    p2.printYourInventor();
    m2.printYourInventor();
  }
}
