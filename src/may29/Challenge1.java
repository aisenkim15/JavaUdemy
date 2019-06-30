package may29;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Challenge1 extends JFrame {

   public Challenge1(){
        setTitle("Entering non number");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        createMenu();
        setSize(250, 200);
        setVisible(true);
    }

    public void createMenu(){
       JMenuBar menu = new JMenuBar();
       JToolBar tb = new JToolBar("Kitae Menu");
       JLabel label = new JLabel("StudentNO");
       JTextField text = new JTextField();
       text.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e) {
               if (e.getKeyChar() < '0' || e.getKeyChar() > '9') {
                   String k = Character.toString(e.getKeyChar());
                   k = k.concat(" is not a number. \r\n enter a new number");
                   JOptionPane.showMessageDialog(null, k, "Warning", JOptionPane.ERROR_MESSAGE);
                   e.consume();
               }
           }
       });
       tb.add(label);
        tb.add(text);
        menu.add(tb);
        this.setJMenuBar(menu);
    }

    public static void main(String[] args) {
        new Challenge1();
    }
}
//getKeyChar()