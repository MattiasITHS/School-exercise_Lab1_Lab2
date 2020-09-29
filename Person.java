public class Person{ // #skapa en klass
  public String firstName; // #skapa personens variabler
  public String lastName;
  public int age;
  public boolean hungry;

  public Person(String f,String l,int a,boolean h){                         //konstruktor har samma namn som klassen
    firstName = f;
    lastName = l;
    age = a;
    hungry = h;
  }

  // public void setfirstName(String fn){
  //   firstName = fn;
  // }
  //
  // public String getfirstName(){
  //   return firstName;
  // }
  //
  // public void setage(int a){
  //   age = a;
  // }
  // 
  // public int getage(){
  //   return age;
  }
}
