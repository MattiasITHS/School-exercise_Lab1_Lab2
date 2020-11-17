public class snittArray{
  public static void main(String[] args){
    double[] array = {1.4,1.2,1.3,2.4}; //4 bestämda platser
    double[] array2 = new double[10]; // 10 ombestämda platser
    array2[0] = 1.5; // plats noll har värdet 1.5

    double returnValue = snitt(array);

    System.out.println("Snittet är " + returnValue);
  }

  public static double snitt (double[] beforeSnitt) {
    double sum = 0;
    for(int i = 0; i < beforeSnitt.length;i++){
      sum = sum + beforeSnitt[i];
      // sum += beforeSnitt[i];
    }

    return sum/4;
    //before.length kan ersätta 4an
  }
}
