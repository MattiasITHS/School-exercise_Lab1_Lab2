import java.util.Scanner;

public class Metod{
  public static void main(String[]args){
    add(1,5);
    printSubtractTen(4);
    printSubtractTen(10);
    printSubtractTen(11);
    addXAndY(5,4);
    multiplyXwithY(5,5);
    BigThree();
  }
  public static void add(int x, int y){
    System.out.println(x+y);
  }
  public static void printSubtractTen(int x){
    System.out.println(x-10);
  }
  public static int addXAndY(int x, int y){
    System.out.println("Addera "+x+" och "+y+".");
    return x+y;
  }
  public static void BigThree(){
  System.out.println("tre");
  }
  public static int multiplyXwithY(int x, int y){
    System.out.println(x*y);
    return x*y;
  }
}
