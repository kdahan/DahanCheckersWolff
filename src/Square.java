import java.awt.*;

public class Square {

    private int width, height, x, y;
    private Square[][] board;

    public Square(){

        x = 0;
        y = 0;

        board = new Square[8][8];

        width = 800 / 8;
        height = 800 / 8;

    }

    public void draw(Graphics2D g2){

        int x = 0;
        int y = 0;

        for (int r = 0; r < board.length; r += 2) {
            for (int c = 0; c < board[0].length; c += 2) {

                while (x < 800) {
                    g2.setColor(Color.BLACK);
                    g2.fillRect(x, y, width, height);
                    x += width;
                }

                while (y < 800)
                    y += height;

            }

        }

    }

}
