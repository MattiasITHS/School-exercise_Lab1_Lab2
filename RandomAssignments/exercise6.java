package RandomAssignments;

import java.util.Scanner;
public class exercise6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv en siffra mellan 1-10");
    int number = sc.nextInt();
    for(int i =1;i<=10;i++){
      int sum =number*i;
      System.out.println(sum);
    }
  }
}
