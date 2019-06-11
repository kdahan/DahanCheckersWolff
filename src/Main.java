import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public Square[][] board;

    public Main(int w, int h){
        setSize(w, h);

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

    }

    public static void main(String[] args) {
        //The JFrame class represents the window that holds the graphics
        JFrame window = new JFrame("Images!");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 800, 800 + 22); //(x, y, w, h) 22 due to title bar.

        Main panel = new Main(600, 800);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
//        window.setResizable(false);
    }

}