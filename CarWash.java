public class CarWash{
  public void washCar(Car c) {
    if(c.insured && !c.washed) { // ! = inte
      System.out.println("Your car has been washed");
      c.washed = true;
    } else if(!c.insured){
      System.out.println("Your car is not insured and we wont wash it");
    } else {
      System.out.println("Your car is already clean");
    }
  }
}
