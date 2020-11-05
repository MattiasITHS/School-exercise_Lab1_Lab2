package Lab2;

public class Canon {

    public boolean fire(int i, int j, Board board){
        if (board.getBoard(i,j) == 'o') {
            System.out.println("KABOM!");
            System.out.println("Fire again commander!");
            board.setBoard(i,j,'x');
            return true;
        } else if(board.getBoard(i,j) == ' '){
        System.out.println("Splooooosh!");
        board.setBoard(i,j,'.');
        }
        return false;
    }
}



