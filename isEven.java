import java.util.Scanner;

public class isEven{
  public static Scanner input = new Scanner (System.in);
  public static void main(String[] args){
    isEven(4);
    number(5);
  }
  public static int isEven(int number){
    if(number%2==0){
      System.out.println(number+": Ditt nummer är jämt");
      return number;
    } else {
      System.out.println(number+": Ditt nummer är inte jämt");
      return number;
      }
    }
    public static int number(int x){

      System.out.println("Skriv ett tal:");
      x = input.nextInt();
      while(true){
        if(x>0&&x<10){
        System.out.println("Ditt tal är inom intervallen");
      } else {
        System.out.println("tal utanför spec");
      }
      return x;

      }
    }
}
