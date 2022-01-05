package RandomAssignments;

public class lessonArray{
  public static void main(String[] args){

    String[] names = new String[3];
    names[0] = "Ines";
    names[1] = "Cassandra";
    names[2] ="Mattias";

    int[] numbers = {6,8,4,1,2,7}; //snabbare sätt att ge platser i Array värde istället för int,int,int.
    int[] numbers2 = {52,6321,6,231,78,2351};

    printOneIntArray(numbers);
    System.out.println();
    printOneIntArray(numbers2);
  }
  public static void printOneIntArray(int[] array){
    for(int i =0; i<array.length;i++){
      System.out.println(array[i]);
    }
  }
}
