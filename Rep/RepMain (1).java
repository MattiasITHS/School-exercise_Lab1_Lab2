import java.util.*;

public class RepMain {
  public static void main(String[]args) {
    int[] array1 = new int[5];
    String[] array2 = {"Vince","Jeff","Greta","Dennis"};
    array1[0] = 1;
    array1[1] = 3;
    array1[2] = 5;
    array1[3] = 7;
    array1[4] = 9;

    int temp = array1[2];

    array1[2] = array1[1];
    array1[1] = temp;
    // printIntArray(array1);
    // printStringArray(array2);

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<String> list2 = new ArrayList<String>();

    list1.add(2);
    list1.add(4);
    list1.add(6);
    list1.add(8);
    list1.add(10);

    printArrayListInteger(list1);

    list2.add("Hej");
    list2.add("Yo");
    list2.add("Tja");
    list2.add("Tjabba");

    list2.remove(3);

    printArrayListString(list2);

  }

  public static void printIntArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    System.out.println();
  }

  public static void printStringArray(String[] array) {
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    System.out.println();
  }

  public static void printArrayListInteger(ArrayList<Integer> list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println();
  }

  public static void printArrayListString(ArrayList<String> list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println();
  }
}
