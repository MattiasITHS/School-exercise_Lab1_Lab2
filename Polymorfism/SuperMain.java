public class SuperMain{
  public static void main(String[]args){
    SuperTeacher t1 = new SuperTeacher("Vincent");

    SuperStudent s1 = new SuperStudent("Jeff");

    s1.sayHello();
    t1.sayHello();
    // t1.age = 20; kan ej nå pga private
  }
}
