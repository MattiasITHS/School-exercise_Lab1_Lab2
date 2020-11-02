package Lab2;

class Canon {

    public boolean fire(int i, int j, Board board){

        if (board.getBoard(i,j) == 'o') {
            System.out.println("KABOM!");
            board.setBoard(i,i,'x');

        } else if(board.getBoard(i,j) == ' '){
            System.out.println("Splooooosh!");
            board.setBoard(i,j,'.');
            return false;
        }
        return true;
    }
}
