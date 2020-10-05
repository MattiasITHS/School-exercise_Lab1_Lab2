public class BookProgram{
  public static void main (String[]args){
    Book b1 = new Book("The Shining", "Stephen King");
    Book b2 = new Book("Pippi");
    Book b3 = new Book("Madicken" , "Astrid Lindgren");
    Book b4 = new Book();
    b4.setTitle("Emil");
    b4.setAuthor("Astrid Lindgren"); // sätter förfättare och titel till bok som hämtas från Book klass.
    System.out.println(b2);
    System.out.println(b1);
    System.out.println(b3.getTitle());
    System.out.println(b4);
    System.out.println(Book.getNumbersOfBooks());
  }
}
