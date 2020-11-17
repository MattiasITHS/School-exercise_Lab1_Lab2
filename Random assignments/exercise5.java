import java.util.Scanner;
public class exercise5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String letter = sc.nextLine();
    if(letter.matches("a|o|u|å|i|y|ä|ö")){
      System.out.println("VOKAL!");
    }else{
      System.out.println("Konsonant!");
    }
  }
}
