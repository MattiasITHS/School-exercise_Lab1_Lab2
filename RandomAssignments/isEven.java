package RandomAssignments;

import java.util.Scanner;

public class isEven{
  public static Scanner input = new Scanner (System.in);
  public static void main(String[] args){
    
    isEven();
  }
  public static void isEven(){
    System.out.println("Mata in ett tal");
    int number = input.nextInt();
    if(number%2==0){
      System.out.println(number+": Ditt nummer är jämnt");
    } else {
      System.out.println(number+": Ditt nummer är inte jämnt");
    }
  }
}
