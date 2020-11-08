package Lab2;

public class Canon {
    public boolean fire(int i, int j, Board board){
        if (i > BattleShip.ROW_NUM || j > BattleShip.COL_NUM){
            System.out.println("You fired out of the board!");
            return false;
        } else if (board.getBoard(i,j) == 'x') {
            System.out.println("You already set that spot on fire! fire again! Try again!");
            return true;
        } else if (board.getBoard(i,j) == 'o') {
            System.out.println("KABOM!");
            board.setBoard(i,j,'x');
            return true;
        } else if(board.getBoard(i,j) == ' '){
        System.out.println("Splooooosh!");
            if (checkNear(i,j,board)){
                System.out.println("But it was a close one!");
            }
        board.setBoard(i,j,'.');
        }
        return false;
    }
    private boolean checkNear(int i, int j, Board board){
// TODO skott på j-1 och i-1 och i+1 och j +1 ska printa but it was a close one.
        if(board.getBoard(i+1,j) == 'o' || board.getBoard(i,j) == 'o'){
            return true;
        } else if (board.getBoard(i,j+1) == 'o' || board.getBoard(i,j) == 'o') {
            return true;
        } else {
            return false;
        }
    }
}
