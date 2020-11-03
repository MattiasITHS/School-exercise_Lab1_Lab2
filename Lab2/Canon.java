package Lab2;

public class Canon {

    public boolean fire(int i, int j, Board board){

        if (Board.getBoard(i,j) == 'o') {
            System.out.println("KABOM!");
            Board.setBoard(i,j,'x');

        } else if(Board.getBoard(i,j) == ' '){
            System.out.println("Splooooosh!");
            Board.setBoard(i,j,'.');
            return false;
        }
        return true;
    }
}
