public class practiceArray{
  public static void main(String[] args){

    int[] number = {1,2,3};
    int[] numbers = new int[3];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;

    createArray(0);
    printArray(number);
    doubleUpArray(number);

  }
  public static void createArray(int x){
    int[] array = new int [6];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;
    array[5] = 6;
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i]);
    }
    System.out.println("");
  }
  public static void printArray(int[] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]);
    }
    System.out.println("");

  }
  public static void doubleUpArray (int[] arr){

    int[] array = new int[6];
    int[] arrays = {1,2,3,4,5,6};
    for(int i = 0; i < arrays.length; i++){
      System.out.print(arrays[i]);
    }
  }
}
