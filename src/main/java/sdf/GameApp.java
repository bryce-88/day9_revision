package sdf;

public class GameApp {
    
    public static void main(String[] args) {
        String[] tttBoard = new String[9];
        String player = "X";

        for (int i = 0; i < tttBoard.length; i++) {
            tttBoard[i] = String.valueOf(i+1);
        }

        //print out initial tic tac toe board
        TicTacToe ttt = new TicTacToe();
        ttt.printBoard(tttBoard);

        System.out.println("Tic Tac Toe Game");
        System.out.println("Player 'X' starts first");

    }
}
