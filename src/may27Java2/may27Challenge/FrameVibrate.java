package may27Java2.may27Challenge;

import javax.swing.*;
import java.awt.*;

public class FrameVibrate extends JFrame {
    public FrameVibrate(){
        setTitle("Vibrating Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        setSize(500, 500);
        setVisible(true);
        Vibrate thread = new Vibrate(c);
        thread.start();
    }

    public static void main(String[] args) {
        new FrameVibrate();
    }
}

class Vibrate extends Thread{
    int x = 100;
    int y = 100;
    private Container container;
    private int counter =1;
    private int counter2 = 0;
    public Vibrate(Container c){
        container = c;
    }

    @Override
    public void run() {
        JLabel label = new JLabel("Vibrating Label");
        label.setLocation(x, y);
        container.add(label);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            return;
        }
        while (true) {
            switch(counter){
                case 1:
                    label.setLocation(x+5,y);
                    break;
                case 2:
                    label.setLocation(x - 5, y);
                    break;
                case 3:
                    label.setLocation(x, y + 5);
                    break;
                case 4:
                    label.setLocation(x, y - 5);
                    break;
            }
            counter++;
            counter2++;
            if(counter > 4){counter = 1;}
            if(counter2 == 1000000){
                return;
            }
        }
    }
}




