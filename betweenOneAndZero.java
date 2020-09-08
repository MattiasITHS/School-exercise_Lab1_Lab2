import java.util.Scanner;
  public class betweenOneAndZero{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
      System.out.println("Skriv in 2 tal;");
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();

      betweenOneAndZero(num1,num2);
    }
    public static boolean betweenOneAndZero(double a, double b){
      if(a > 0 && b > 0 && a < 1 && b < 1 ){
        System.out.println("Dina nummer är strikt mindre än 1 men större än 0");
        return true;
      } else {
        return false;
      }
    }
  }
