public class findLargestAndSmallest{
  public static void main(String[] args){
    int[] array = {12,43,6644,3231,77,2};
    findLargestAndSmallest(array); // kalla på denna metod för att få fram vilket tal som är störst och minst i din array
  }
  public static void findLargestAndSmallest(int[] array){

    int biggest = array[0];
    int smallest = array[0];
    for(int i = 0; i < array.length; i++){
      //en jämnförelsesats som jämnför om indexplats i array är större eller mindre än biggest/smallest
      if(array[i] > biggest){ // array[i] där i är indexplatsen.
        biggest = array[i];
      } else if (array[i] < smallest){
        smallest = array[i];
      }
    }
      System.out.println("Biggest number: "+biggest+" and smallest number: "+smallest);
  }
}
