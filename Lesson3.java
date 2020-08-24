import java.util.Scanner;
public class Lesson3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int number2 = sc.nextInt();
    for(int i =number;i>=number2;i--){
      System.out.println(i);
    }

  }
}
