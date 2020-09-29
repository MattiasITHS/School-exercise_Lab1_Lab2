public class CarWashProgram{
  public static void main(String[]args){
    Car c1 = new Car("Volvo", 1988, false, true);
    Car c2 = new Car("Saab", 2000, false, false);
    CarWash cw = new CarWash();
    cw.washCar(c1);
    cw.washCar(c1);
    cw.washCar(c2);
  }
}
