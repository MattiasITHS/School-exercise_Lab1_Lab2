package RandomAssignments;

import java.util.Scanner;

public class Taxes{
  public static void main(String[]args){

  System.out.println(calculateTax(500000));
  System.out.println(fibonacci(2));

  }

  public static double calculateTax(double grossSalary){
    if(grossSalary > 100000){
      return grossSalary*0.4;
    }else{
      return grossSalary*0.3;
    }
  }
  public static int fibonacci(int number){
    if(number == 0){
      return 0;
    }else if(number == 1){
      return 1;
    } else {
      return fibonacci(number-2)+fibonacci(number-1);
    }
  }
}
