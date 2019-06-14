import java.awt.*;

public class Checker {

    private int x, y;
    private Checker[][] black, red;

    public Checker(int x, int y){

        this.x = x;
        this.y = y;

        black = new Checker[4][3];
        red = new Checker[4][3];

    }

    public void drawRed(Graphics2D g2) {

        for (int r = 0; r < red.length; r++) {
            for (int c = 0; c < red[0].length; c++) {
                if ((r + c) % 2 == 0) {
                    g2.setColor(new Color(255, 0, 0));
                    g2.fillOval(x, y, 100, 100);
                }
            }
        }

    }

    public void drawBlack(Graphics2D g2){

        for (int r = 0; r < black.length; r++) {
            for (int c = 0; c < black[0].length; c++) {
                if ((r + c) % 2 == 0) {
                    g2.setColor(Color.BLACK);
                    g2.fillOval(x, y, 100, 100);
                }

            }

        }

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
