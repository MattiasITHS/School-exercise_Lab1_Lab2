package HotDog;

public class Person{ // #skapa en klass
  public String firstName; // #skapa personens variabler
  public String lastName;
  public int age;
  public boolean hungry;
  public final String SPIECIES = "Human"; // final är konstanter som är satta och oförändliga.

  public Person(String firstName,String lastName,int age, boolean hungry){                         //konstruktor har samma namn som klassen
    this.firstName = firstName; // this - vår instans.
    this.lastName = lastName;
    this.age = age;
    this.hungry = hungry;
  }

  public Person(String firstName,String lastName,int age) {
    this.firstName = firstName; // this - vår instans.
    this.lastName = lastName;
    this.age = age;
  }
  // public Person(String f){
  //   this(f,"Hovde");
  // }

  public void setfirstName(String firstName){
    this.firstName = firstName;
  }
  public String getfirstName(){
    return firstName;
  }
  public void setage(int a){
    age = a;
  }
  public int getAge(){
    return age;
  }
  public String toString(){ // måste heta toString för att det ska funka att printa.
    return firstName + " " + lastName + " is " + age + " years old.";
  }
  public Book writeBook(String title){
    Book b = new Book(title, this.firstName + " " +this.lastName);
    return b;
  }
}
