package RandomAssignments;

import java.util.Scanner;

public class checkNumber{
  public static Scanner input = new Scanner (System.in);
  public static void main(String[] args){

    checkMyNumber();
  }

  public static void checkMyNumber(){
    boolean condition = true;
    int number;
    while(condition){
      System.out.println("Skriv ett tal:");
      number = input.nextInt();

      if(number >= 0 && number < 10){
      System.out.println("Ditt tal är inom intervallen 0-10");
      condition = false;
    } else {
      System.out.println("tal utanför intervallen 0-10");
      }
    }
  }
}
