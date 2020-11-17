public class ProblemArray {

  public int[] createArray (int length, int number, int position) throws ArrayLengthException{
    if(length > 10) {
      throw new ArrayLengthException();
    }

    int[] array = new int[length];
    array[position] = number;
    return array;
  }

  public void printArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
