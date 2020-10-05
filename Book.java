public class Book{
  private String title;
  private String author;
  private static int numbersOfBooks; // static klassvariabel
  public Book(String t, String a){
    title = t;
    author = a;
    numbersOfBooks++;
  }
  public Book(){
    numbersOfBooks++;
  }
  public Book(String t){
    this(t, "No author");
  }
  public void setTitle(String ti){
    title = ti;
  }
  public void setAuthor(String au){
    author = au;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public static int getNumbersOfBooks(){
    return numbersOfBooks;
  }
  public String toString(){ // metod som konverterar instans till en String- representation
    return author + " - " + title;
  }
}
