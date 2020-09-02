import java.util.Scanner;

public class diamon {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Skriv en siffra (udda tal)");
    int noOfRows = sc.nextInt();
    int rowCount = 1;
    int midRow = noOfRows/2;




    for(int i = 0; i <= noOfRows/2+1; i++ ) {
      for (int j = 1; j <= noOfRows-i; j++){
        System.out.print(" ");
      }
      for(int j = 1;j <= 2*i-1; j++){
        System.out.print("*");
      }
        System.out.println("");


    }
    for(int i = noOfRows/2; i >= 1; i--) {
      for (int j = 1; j <= noOfRows-i; j++) {
        System.out.print(" ");
      }
      for(int j = 1;j <=2*i-1; j++){
        System.out.print("*");
      }
        System.out.println("");

    }



  }
}
