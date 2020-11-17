import java.util.Scanner;
public class exercise2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();

    if(number>number2){
      System.out.println(number);
    }else if(number2>number3){
      System.out.println(number2);
    }else{
      System.out.println(number3);
    }
  }
}
