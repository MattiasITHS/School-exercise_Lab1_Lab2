package RandomAssignments;

import java.util.Scanner;

public class exercise7{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int nrOfRows;
    Boolean gameOn = true;

    System.out.println("How tall should the pyramid be?");

    do{
      System.out.print("Type a number (odd number): ");

      nrOfRows = sc.nextInt();

      if(nrOfRows % 2 == 0) {
        System.out.println("Type an odd number");
      }
      else{
        gameOn = false;
      }
    }while(gameOn);

    skapaPyramid(nrOfRows/2+1);
  }

  public static void skapaPyramid(int nrOfRows) {

    for(int i = 0; i <= nrOfRows; i++) {
      for(int j = 1; j <= nrOfRows-i; j++) {
        System.out.print(" ");
      }
      for(int j = 1; j<=2*i-1;j++){
        System.out.print("*");
      }
      System.out.println("");
    }

    for(int i = nrOfRows - 1; i >= 1; i--) {
      for(int j = 1; j <= nrOfRows - i; j++) {
        System.out.print(" ");
      }
      for(int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
// for(int i = noOfRows/2+1; i > 0;i--) {
//   for (int j = 1; j <= i;j++){
//     System.out.print(" ");
//   }
//   for(int j = 1;j <= rowCount;j++){
//     System.out.print("*"+" ");
//   }
//     System.out.println();
//       rowCount++;
// }
// for(int j = noOfRows/2+1; j >= 1;j--) {
//   for (int i =1; i <= noOfRows;i++){
//     System.out.print(" ");
//   }
//   for(int i = 1;i <= rowCount;i++){
//     System.out.print(" "+"*");
//   }
//     System.out.println();
//       rowCount--;
// }
