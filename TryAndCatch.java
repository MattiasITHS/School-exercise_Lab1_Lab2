import java.util.*;

public class TryAndCatch {
    static Scanner input = new Scanner(System.in);
    public static void main(String[]args){

        int age = enterAge();
            System.out.println("Age accepted " + age);


        boolean[] array;
        try{
            array = coolArray(7);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Wrong index");
        }
    }
    public static int enterAge(){
        Scanner input = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age: ");
        try{
            age = input.nextInt();
        } catch(Exception e){
            System.out.println("Wrong, try again");
            age = enterAge(); // kallar på metod gör att input frågas om igen tills rätt input matas in
        } finally {
            return age;
        }
    }
    public static boolean[] coolArray(int position){
        boolean[]array = new boolean[5];
        array[position] = true;

        return array;
    }
}
/*

 */
