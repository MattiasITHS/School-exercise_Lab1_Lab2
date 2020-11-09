import java.util.*;

public class TryAndCatch {
    static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        int age = enterAge();

            System.out.println("Age accepted " + age);



    }
    public static int enterAge(){
        int age = 0;
        System.out.println("Enter your age: ");
        try{
            age = input.nextInt();
        } catch(Exception e){
            System.out.println("Wrong, try again");
            age = enterAge();
        } finally {
            return age;
        }
    }
}
