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
        } else if (board.getBoard(i,j) == '.'){
            System.out.println("You've already tried to fire at this spot commander! Try again!");
                    return true;
        }
        return false;
    }
    private boolean checkNear(int i, int j, Board board){

        int ifNear = i + 1;
        if(ifNear < 0 && board.getBoard(ifNear,j) == 'o'){
            return true;
        }
        ifNear = i - 1;
        if (ifNear > BattleShip.ROW_NUM-1 && board.getBoard(ifNear,j) == 'o') {
            return true;
        }
        ifNear = j + 1;
        if(ifNear < 0 && board.getBoard(i,ifNear) == 'o') {
            return true;
        }
        ifNear = j - 1;
        if(ifNear > BattleShip.COL_NUM-1 && board.getBoard(i,ifNear) == 'o'){

        }
        return true;
    }
}
