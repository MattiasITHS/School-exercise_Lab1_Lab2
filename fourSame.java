import java.util.Scanner;
public class fourSame{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    boolean inputs = true;
    while(inputs){
      System.out.println("Mata in 4 st heltal:");
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int num3 = input.nextInt();
      int num4 = input.nextInt();
      boolean value = fourSame(num1,num2,num3,num4);
      if(value){
        System.out.println("Korrekt!");
        test = false;
      } else {
        System.out.println("Tönt, testa igen!");
      }
    }
  }


  public static boolean fourSame(int a, int b, int c, int d){
      if(a == b && b == c && c == d){
        return true;
      } else {
        return false;
    }
  }
}
