package RandomAssignments;

import java.util.Scanner;

public class analysTrue{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println(checkIfTrue("Mattias",31,"Mjukvarutestare",2));




  }
  public static boolean checkIfTrue(String name, int age, String school, int kids){
    if (name.equals("Mattias") || age == 31 || school.equals("Mjukvarutestare") || kids == 2){
      return true;
    } else {
      return false;
    }
  }
}
