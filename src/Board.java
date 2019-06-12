import java.awt.*;

public class Board {

    private Square[][] board;

    public Board(){

        board = new Square[8][8];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if(r + c % 2 == 0)

                    board[r][c] = new Square(r, c);

            }

        }

    }

    public void draw(Graphics2D g2) {

        for (Square[] r : board) {
            for (Square c : r) {
                if(c != null)
                    c.draw(g2);
                //help me plz

            }
        }

    }

}
