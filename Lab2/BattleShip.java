package Lab2;

import java.util.Scanner;

public class BattleShip {
    public static Scanner input = new Scanner(System.in);
    final static int ROW_NUM = 10;
    final static int COL_NUM = 10;
    final static int NR_OF_BOATS = 4;

    public static void main(String[] args) {

        Board b = new Board(ROW_NUM, COL_NUM);
        Board b1 = new Board(ROW_NUM, COL_NUM);

        System.out.println("Player 1 turn");
        b = initialize();
        System.out.println("Player 2 turn.");
        b1 = initialize();

        boolean winner = false;
        boolean next = true; //next == player1. !next == player2
        while(!winner) {
            if (next) {
                System.out.println("Player 1 turn");
                if (turn(b1)) {
                    if (checkWinner(b1)) {
                        System.out.println("Congratz. Player 1 won the battle!");
                    winner = !winner;
                } else {
                        System.out.println("Fire again Commander!");
                    }
            } else {
                next = !next;
            }
        } else {
                System.out.println("Player 2 turn");
                if(turn(b)){
                    if(checkWinner(b)) {
                        System.out.println("Congratz. Player 2 won the battle!");
                        winner = !winner;
                    } else {
                        System.out.println("Fire again Commander!");
                    }
                } else {
                    next = !next;
                }
            }
        }
        System.out.println("Game over");
    }

    public static boolean turn(Board target) {

        Canon c = new Canon();

        target.showFog();
        System.out.println("Choose where to fire the canon!");
        System.out.print("Row: ");
        int fireRow = input.nextInt();
        System.out.print("Column ");
        int fireCol = input.nextInt();

        boolean hit = c.fire(fireRow, fireCol, target);

        target.showFog();
        return hit;
    }

    private static Board initialize() {
        Board board = new Board(ROW_NUM, COL_NUM);
        // TODO byt 1 till NR_OF_BOATS
        while (board.getPlaceboat() <= 1) {
            board.show();
            System.out.println("Commander! place ship: " + board.getPlaceboat());
            System.out.print("Row: ");
            int row = input.nextInt();
            System.out.print("Column: ");
            int col = input.nextInt();
            System.out.print("Orientation of your ship(v for vertical, h for horizontal): ");
            char orient = input.next().charAt(0);


            board.placeBoat(row, col, orient);


        }
        board.show();
        return board;
    }

    private static boolean checkWinner(Board board) {

        int sunkShip = 0;
        for(int i = 0; i < ROW_NUM; i++){
            for(int j = 0; j < COL_NUM; j++){
                if (board.getBoard(i,j) == 'x'){
                    sunkShip = sunkShip +1;
                }
            }
        }
        // 3 byts till 12 eller skapa en variabel för 12.
    return sunkShip == 3;
    }
}
