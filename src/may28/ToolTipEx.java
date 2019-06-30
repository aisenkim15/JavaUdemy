package may28;

import javax.swing.*;
import java.awt.*;

public class ToolTipEx extends JFrame {
    private Container contentPane;
    public ToolTipEx(){
        setTitle("Tool Tip Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        createToolBar();
        setSize(400, 150);
        setVisible(true);
    }

    private void createToolBar(){
        JToolBar bar = new JToolBar("Kitae Menu");
        bar.setBackground(Color.LIGHT_GRAY);
        JButton newBtn = new JButton("New");
        newBtn.setToolTipText("Making File");
        bar.add(newBtn);

        JButton openBtn = new JButton(new ImageIcon("images/icon1.png"));
        openBtn.setToolTipText("Opening File");
        bar.add(openBtn);
        bar.addSeparator();

        JButton saveBtn = new JButton(new ImageIcon("images/icon2.png"));
        saveBtn.setToolTipText("Saving File");
        bar.add(saveBtn);

        bar.add(new JLabel("Search"));

        JTextField tf = new JTextField("text field");
        tf.setToolTipText("Enter the char that you are looking for");
        bar.add(tf);
        contentPane.add(bar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new ToolTipEx();
    }
}
