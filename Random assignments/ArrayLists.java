import java.util.ArrayList;
public class ArrayLists{
  public static void main(String[]args){
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(4);
    al.add(5);
    al.add(55);
    al.remove(0);
    al.set(1,6);
    for(int i = 0; i < al.size(); i++){
    System.out.println(al.get(i));
    }
  }
}
