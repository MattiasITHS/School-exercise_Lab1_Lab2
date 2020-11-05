package Lab2;

import java.util.Scanner;

public class BattleShip {
    public static Scanner input = new Scanner(System.in);
    final static int rowNum = 10;
    final static int colNum = 10;

    public static void main(String[] args) {

        Board b = new Board(rowNum, colNum);
        Board b1 = new Board(rowNum, colNum);

        System.out.println("Player 1 turn");
        b = initialize();
        System.out.println("Player 2 turn.");
        b1 = initialize();

        System.out.println("Player 1's turn");
        do{
            turn(b1);

        }while(turn(b1));

    }

    public static boolean turn(Board target) {

        Canon c = new Canon();

        target.showFog();
        System.out.println("Choose where to fire the canon!");
        System.out.print("Row: ");
        int fireRow = input.nextInt();
        System.out.print("Column ");
        int fireCol = input.nextInt();

        c.fire(fireRow, fireCol, target);
        target.showFog();
        return c.fire(fireRow, fireCol, target);
    }

    private static Board initialize() {
        Board board = new Board(rowNum, colNum);
        while (board.getPlaceboat() <= 1) {
            board.show();
            System.out.println("Commander! place 4 ships");
            System.out.print("Row: ");
            int row = input.nextInt();
            System.out.print("Column: ");
            int col = input.nextInt();
            System.out.print("Orientation of your ship(v for vertical, h for horizontal): ");
            char orient = input.next().charAt(0);

            board.placeBoat(row, col, orient);

            if (board.getBoard(row, col) == ' ') {
                System.out.println("Try again!");
            }
        }
        board.show();
        return board;
    }

    private static boolean checkWinner(Board board) {
        int sunkShip = 0;
        for (int i = 0; i < board.getBoard(i,0); i++) {
            for(int j = 0; j < board.getBoard(i,j); i++){
                if (board.getBoard(i,j) == 'x') {
                    sunkShip++;
                }
            }
        }
        return sunkShip == 3;
    }
}

