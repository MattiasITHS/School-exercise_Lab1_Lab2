public class RepMain {
  public static void main(String[]args) {
    ProblemArray pa = new ProblemArray();
    int[] array = {0};
    try{
      array = pa.createArray(13,10,6);
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index is out of bounds.");
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
    pa.printArray(array);
  }
}
