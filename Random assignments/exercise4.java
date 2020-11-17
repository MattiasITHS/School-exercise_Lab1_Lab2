import java.util.Scanner;
public class exercise4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hej, skriv in en siffra mellan 1-7");
    int number = sc.nextInt();
    switch(number){
      case 1:
        System.out.println("Måndag");
        break;
      case 2:
        System.out.println("Tisdag");
        break;
      case 3:
        System.out.println("Onsdag");
        break;
      case 4:
        System.out.println("Torsdag");
        break;
      case 5:
        System.out.println("Fredag");
        break;
      case 6:
        System.out.println("Lördag");
        break;
      case 7:
        System.out.println("Söndag");
        break;
        default:
        System.out.println("Tal utanför skala");
    }
  }
}
