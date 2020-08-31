import java.util.Scanner;

public class ChatBot{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    //objekttyp ,namn på objekt //Nytt objekt

    System.out.println("Hej vad heter du?");
    String name = input.nextLine();
    System.out.println("Hej "+name);
    System.out.println("Hur gammal är du och vad är ditt favoritdjur?");

    int age = input.nextInt();
    String favoriteAnimal = input.next();
    System.out.println("Du är "+age+" år gammal och ditt favoritdjur är "+favoriteAnimal);
  }
}
