package Polymorfism;

import CatDog.Cat;
import CatDog.CatDogAnimal;
import CatDog.Dog;

public class MainAnimal{
  public static void main(String[]args){
    SuperLion l1 = new SuperLion("Simba");
    SuperLion l2 = new SuperLion("Nala");
    SuperLion l3 = new SuperLion("Scar");
    SuperHyena h1 = new SuperHyena("Timon");
    SuperHyena h2 = new SuperHyena("Pumba");
    h1.laugh();
    h2.eat("carcass");
    l3.eat("meat");

    l1.roar("chicken");
    l2.roar("meat");
    System.out.println(h1.getName());

    Cat c = new Cat();
    Dog d = new Dog();
    shelter(c);
    shelter(d);
    System.out.println(c.sheltered);
    System.out.println(d.sheltered);
    c.makeSound();
    d.makeSound();

  }

  public static void shelter(CatDogAnimal a){
    a.sheltered = true;
  }
}
