public class myEmployeeSystem{
  public static void main(String[]args){
    Employee e1 = new Employee(); // Employee är nu en typ, vilket vi kan använda när vi deklarerar variabler
    Employee e2 = new Employee(); // Employee är en klass och e1 och e2 är instanser
    e1.name = "Mattias Hovde";
    e2.name = "Theo Jagersten";
    e1.age = 31;
    e2.age = 1;
    System.out.println(e1.name);
    e1.sayHello();
  }
}
