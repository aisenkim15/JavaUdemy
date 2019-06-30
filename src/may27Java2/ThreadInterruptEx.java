package may27Java2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadInterruptEx extends JFrame {
    private boolean flag = false;
    Thread th;
    public ThreadInterruptEx(){
        setTitle("Thread Interrupt Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

        TimerRunnable timerRunnable = new TimerRunnable(timerLabel);
        th = new Thread(timerRunnable);

        th.start();
        c.add(timerLabel);

        JButton jb = new JButton("Kill Time");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton button = (JButton) e.getSource();
                button.setEnabled(false);
            }
        });
        JButton jb2 = new JButton("Enabler");
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                th = new Thread(timerRunnable);
                th.start();
                JButton btn2 = (JButton) e.getSource();
                jb.setEnabled(true);
            }
        });
        c.add(jb);
        c.add(jb2);
        setVisible(true);
        setSize(400, 400);
        }

    public static void main(String[] args) {
        new ThreadInterruptEx();
    }
}

class TimerRunnable extends Thread{
    private JLabel timerLabel;
    int saved = 0;
    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n=saved;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                saved=n;
                return;
            }

        }
    }
}
