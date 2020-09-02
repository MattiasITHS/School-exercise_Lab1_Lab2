import java.util.Scanner;

public class avarageNumber{
  public static Scanner input = new Scanner (System.in);
  public static void main(String[] args){

    System.out.println("Hej, mata in två tal;");

    System.out.println("The avarage of your input is "+addAvarage());

  }
  public static double number(){
    double a = input.nextInt();
    return a;
  }
   public static double addAvarage(){
      double a = number();
      double b= input.nextInt();
      double sum = a+b;
      double result = sum/2;
      return result;
   }
}
