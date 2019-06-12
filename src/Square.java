import java.awt.*;

public class Square {

    private int width, height, x, y;

    public Square(int x, int y){

        this.x = x;
        this.y = y;

        width = 800 / 8;
        height = 800 / 8;

    }

    public void draw(Graphics2D g2){

        g2.fillRect(x, y, width, height);

    }

}
