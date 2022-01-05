package RandomAssignments;

import java.util.Scanner;
public class fourSame{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){

    while(true){
      System.out.println("Mata in 4 st heltal:");
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int num3 = input.nextInt();
      int num4 = input.nextInt();
      if(fourSame(num1,num2,num3,num4)){
        System.out.println("Korrekt!");
        break;
      } else {
        System.out.println("Tönt, testa igen!");
      }
    }
  }

  public static boolean fourSame(int a, int b, int c, int d){
      return (a == b && b == c && c == d);
  }
}
