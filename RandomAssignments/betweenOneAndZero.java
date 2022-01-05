package RandomAssignments;

import java.util.Scanner;
  public class betweenOneAndZero{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
      System.out.println("Skriv in 2 tal;");
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();

      if(betweenOneAndZero(num1,num2)){ // en if sats är alltid sant eller falskt.
                                        // Eftersom vi retunerar en boolean från betweenOneAndZero
                                        // så är värdet är alltid sant eller falskt.
        System.out.println("Dina nummer är strikt mindre än 1 men större än 0");
      } else {
        System.out.println("Dina nummer är större än 1");
      }

    }
    public static boolean betweenOneAndZero(double a, double b){
      return (a > 0 && b > 0 && a < 1 && b < 1);
    }
  }
