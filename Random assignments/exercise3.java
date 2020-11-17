import java.util.Scanner;
public class exercise3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double number = sc.nextDouble();
    if(number>0){
      System.out.println("Positivt");
    }else if(number == 0){
      System.out.println("Noll");
    }else if(number<0){
      System.out.println("Negativt");
    }
    if(number<1){
      System.out.println("Litet");
    }else if(number>1000000){
      System.out.println("Stort");
    }
  }
}
