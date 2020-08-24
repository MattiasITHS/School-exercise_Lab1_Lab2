import java.util.Scanner;
public class Lesson4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int number2 = sc.nextInt();
    for(int i =number;i<=number2;i++){
      if(i%2==0){
    System.out.println(i);
  }else{
    i=i+1;
    System.out.println(i);
  }
    }
  }
}
