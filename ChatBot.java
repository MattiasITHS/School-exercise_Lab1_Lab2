import java.util.Scanner;

public class ChatBot{
  public static Scanner input = new Scanner (System.in);
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    //objekttyp ,namn på objekt //Nytt objekt
    greetings();
    job();
  }
  public static void greetings(){
    System.out.println("Hej, vad heter du?");
    String name = input.nextLine();
    System.out.println("Hej "+name);
  }
  public static void job(){
    System.out.println("Vad studerar du till?");
    String job = input.nextLine();
    System.out.println("Du studerar till "+job+", va roligt!");
  }
}
