package RandomAssignments;

import java.util.Scanner;

public class stringCompare{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println(textStrings("Grattis"));
  }

  public static String textStrings(String a){
    while (true){
      System.out.println("Input 2 strings");
      a = input.nextLine();
      String b = input.nextLine();
      if(a.equals(b)){
        return "Grattis";
      } else if ( a!=b ){
        System.out.println("try again");
        }
      }
    }
  }
