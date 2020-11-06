package Lab2;

import java.util.Scanner;

public class BattleShip {
    public static Scanner input = new Scanner(System.in);
    final static int rowNum = 10; // gameboard setter.
    final static int colNum = 10;

    public static void main(String[] args) {

        Board b;
        Board b1;

        System.out.println("Player 1 turn");
        b = initialize();
        System.out.println("Player 2 turn.");
        b1 = initialize();

        boolean winner = false;
        boolean next = true;
        while(!winner) {
            if (next) {
                System.out.println("Player 1 turn");
                if (turn(b1)) {
                    if (checkWinner(b1)) {
                    winner = !winner;
                }
            } else {
                next = !next;
            }
        } else {
                System.out.println("Player 2 turn");
                if(turn(b)){
                    if(checkWinner(b)) {
                        winner = !winner;
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

        Board board = new Board(rowNum, colNum);

        while (board.getPlaceboat() <= 1) {
            board.show();
            System.out.println("Commander! place your ships");
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
        /*
        tar emot ett Board-objekt
        om alla skepp har sänkts returneras true annars false.
         */
        
        int hits = 0;
    return false;
    }
}

