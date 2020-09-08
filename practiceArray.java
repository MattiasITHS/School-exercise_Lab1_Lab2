public class practiceArray{
  public static void main(String[] args){

    int[] myArray = createArray(8);
    System.out.println();

    System.out.println(myArray[4]);                //övning 1
    System.out.println(myArray[3]);

    printArray(myArray);                           // övning 2
    System.out.println();

    int[] doubleArray = doubleUpArray(myArray);    //övning 3
    printArray(doubleArray); //kan aldrig ändra storleken på en array.


  }
  public static int[] createArray(int x){
    int[] array = new int[x];
    for(int i = 0; i < x; i++){
      array[i] = i+1;
      System.out.print(array[i]);
    }
    return array;
  }
  public static void printArray(int[] arr){
    System.out.print("[");
    for(int i = 0; i < arr.length-1; i++){
      System.out.print(arr[i]+ ",");
    }
    System.out.println(arr[arr.length-1] + "]");

  }
  public static int[] doubleUpArray (int[] array){
    int[] newArray = new int[array.length*2];
    for(int i = 0; i < array.length; i++){
      newArray[i] = array[i];
    }
    return newArray;
  }
}
