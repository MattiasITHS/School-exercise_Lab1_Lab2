package HotDog;

public class HotDogStand{ // #skapa en klass
  public int hotDogsLeft; // #skapa variabel, mängd korv kvar

  public void feedPerson(Person p){ // #skapa metod, mata person med in argument; Person objekt
    if (hotDogsLeft > 0 && p.hungry){        //finns det korv kvar?, if sats, om person är hungrig?
                                               // dekrementera mängd, print: finns ingen korv kvar
        System.out.println("Här, ta en körv");
        p.hungry = false;
        hotDogsLeft--;
      } else if (!p.hungry){                    //!. är lika med NOT, lika med p.hungry == false
        System.out.println("You are not hungry");
      } else if (hotDogsLeft <= 0){
        System.out.println("No körv left, come back tomorrow");
      }
  }
}
