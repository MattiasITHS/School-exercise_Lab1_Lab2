import java.util.Scanner;
public class exercise{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[]args){
    int number = sc.nextInt();
    if(number>1){
      System.out.println("Positivt");
    }else if(number == 0){
      System.out.println("Noll");
    }else if(number<0){
      System.out.println("Negativt");
    }
  }
}
