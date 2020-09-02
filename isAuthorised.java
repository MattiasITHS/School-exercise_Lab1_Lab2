import java.util.Scanner;
  public class isAuthorised{
    public static Scanner input = new Scanner (System.in);
    public static void main(String [] args){


      for(int i = 0; i < 5;i++){
        boolean authorised = isAuthorised();
        if (authorised && i == 4){
          System.out.println("Lucky one, du lyckades på sista försöket");
        }else if (authorised){
          System.out.println("Grattis! du har matat in rätt kod!");
      } else {
        System.out.println("FEL! Testa igen.");
        }
      }
    }
    public static boolean isAuthorised(){
      System.out.println("Mata in 3 st lösenord");
      String guess1 = input.nextLine();
      String guess2 = input.nextLine();
      String guess3 = input.nextLine();

      return guess1.equals("piggy") && guess2.equals("bark") && guess3.equals("snuff")
      ||guess1.equals("bark") && guess2.equals("snuff") && guess3.equals("piggy")
      ||guess1.equals("snuff") && guess2.equals("piggy") && guess3.equals("bark")
      ||guess1.equals("piggy") && guess2.equals("snuff") && guess3.equals("bark")
      ||guess1.equals("bark") && guess2.equals("piggy") && guess3.equals("snuff")
      ||guess1.equals("snuff") && guess2.equals("bark") && guess3.equals("piggy");
    }
  }
