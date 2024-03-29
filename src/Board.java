import java.awt.*;

public class Board {

    private Square[][] board;

    public Board(){

        board = new Square[8][8];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if((r + c) % 2 == 0)

                    board[r][c] = new Square(r * 100, c * 100);

            }

        }

    }

    public void draw(Graphics2D g2) {

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if(board[r][c] != null) {
                    board[r][c].draw(g2);
                }

            }

        }

    }

}
