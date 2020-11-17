public class SuperLion extends SuperAnimal{
  public SuperLion(String name){
    super(name);
  }
  public void roar(String food){
    System.out.println(getName() + " roars ");
    eat(food);
  }
}
