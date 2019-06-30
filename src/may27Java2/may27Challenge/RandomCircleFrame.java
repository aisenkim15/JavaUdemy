package may27Java2.may27Challenge;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RandomCircleFrame extends JFrame {
    public RandomCircleFrame(){
        super("Random Moving Circle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new CirclePanel());
        setSize(250, 250);
        setVisible(true);
    }

    class CirclePanel extends JPanel implements Runnable {
        private int x = 100;
        private int y = 100;
        public CirclePanel(){
            this.addMouseListener(new MouseAdapter() {
                private Thread th = null;

                @Override
                public void mousePressed(MouseEvent e) {
                    if (th == null) {
                        th = new Thread(CirclePanel.this);
                        th.start();
                    }
                }
            });
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, 50, 50);
        }
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    return;
                }
                x = (int) (Math.random() * this.getWidth());
                y = (int) (Math.random() * this.getHeight());
                repaint();
            }
        }
    }

    public static void main(String[] args) {
        new RandomCircleFrame();
    }
}

