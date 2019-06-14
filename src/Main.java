import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JPanel{

    private int x, y;
    private Board board;
    private Checker[][] black;
    private int[][] boardFull;

    public Main(int w, int h){
        setSize(w, h);

        x = 0;
        y = 0;

        black = new Checker[8][8];
        boardFull = new int[8][8];

        for (int r = 0; r < black.length; r++) {
            for (int c = 0; c < black[0].length; c++) {
                if ((r + c) % 2 != 0) {
                    if (r <= 2)
                        black[r][c] = new Checker(c * 100, r * 100);

                    if (r >= 5)
                        black[r][c] = new Checker(c * 100, r * 100);
                    boardFull[r][c] = 1;
                }
            }

        }



        board = new Board();
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

                int ecks = e.getX() % 100;
                int why = e.getY() % 100;



            }

            @Override
            public void mouseReleased(MouseEvent e) {

                int ex = e.getX();
                int wy = e.getY();

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        board.draw(g2);

        for (int r = 0; r < black.length; r++) {
            for (int c = 0; c < black[0].length; c++) {
                if (black[r][c] != null)
                    if (r <= 2)
                        black[r][c].drawRed(g2);

            }

        }

        for (int r = 0; r < black.length; r++) {
            for (int c = 0; c < black[0].length; c++) {
                if (black[r][c] != null)
                    if(r >= 5)
                        black[r][c].drawBlack(g2);

            }

        }

    }

    public static void main(String[] args) {
        //The JFrame class represents the window that holds the graphics
        JFrame window = new JFrame("Checkers!");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 800, 800 + 22); //(x, y, w, h) 22 due to title bar.

        Main panel = new Main(600, 800);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
        window.setResizable(false);
    }

}