import java.util.Scanner;

public class Strings{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    textStrings();
  }

  public static void textStrings(){
    boolean condition = true;
    while (condition){
      System.out.println("Input 2 strings");
      String a = input.nextLine();
      String b = input.nextLine();
      if(a.equals(b)){
        System.out.println("Grattis");
        condition = false;
      } else {
        System.out.println("try again");
        }
      }
    }
  }
