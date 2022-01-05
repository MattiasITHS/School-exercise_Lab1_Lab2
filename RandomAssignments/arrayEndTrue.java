package RandomAssignments;

public class arrayEndTrue{
  public static void main(String[]args){

    endTrue(5,2);

  }
  public static boolean[] endTrue(int a, int b){
    boolean[] array = new boolean[a];

    System.out.println(array.length);
    System.out.println(array[b]);
    System.out.println(array[4]);
    array[b] = true;
    System.out.println(array[b]);
    return array;

  }
}
