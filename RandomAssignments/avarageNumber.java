package RandomAssignments;

import java.util.Scanner;

public class avarageNumber{
  public static Scanner input = new Scanner (System.in);
  public static void main(String[] args){

    System.out.println("Hello, input 2 numbers;");

    System.out.println("The average of your input is "+ addAverage());
  }
  public static double number(){
    double a = input.nextInt();

      return a;
  }
   public static double addAverage(){
      double a = number();
      double b = input.nextInt();
      double sum = a+b;
      double result = sum/2;
      return result;
   }
}
