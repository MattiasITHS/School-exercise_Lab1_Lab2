import java.util.Scanner;

class Board{


  Scanner input = new Scanner(System.in);
  private char [][] box;
  public Board(int rowNum, int columnNum){
    this.box = new char [rowNum][columnNum];
  }

  public static char[][] show(){
   return null;
  }
  public void set(int i, int j){

  }
  public int get(int i, int j){
    return i+j;
  }
}
