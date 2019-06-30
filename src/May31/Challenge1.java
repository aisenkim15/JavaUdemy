package May31;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Challenge1 extends JFrame {
    MyPanel panel = new MyPanel();
    public Challenge1() {
        setTitle("Dividing Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(300, 300);
        setVisible(true);

    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/pear.jpg");
        private Image img = icon.getImage();
        int x = super.getWidth()/2 -10;
        int y = super.getHeight()/2 - 10;

        public void paintComponent(Graphics g) {
            super.paintComponent(g); //which is it talking about
            g.drawImage(img, 0, 0, x, y, 0, 0, 200, 200, this);
        }
    }

    public static void main(String[] args) {
        new Challenge1();
    }
}

