package may28;

import javafx.scene.control.ToolBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarExit extends JFrame {
    Container contentPane;
    public ToolBarExit(){
        setTitle("ToolBarMenu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        createToolBar();
        setSize(400, 350);
        setVisible(true);
    }

    private void createToolBar(){
        JToolBar bar = new JToolBar("Kitae Menu");
        JButton newBtn = new JButton("End");
        newBtn.setToolTipText("Exit Program");
        MenuActionListener listener = new MenuActionListener();
        newBtn.addActionListener(listener);
        bar.add(newBtn);
        contentPane.add(bar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new ToolBarExit();
    }

    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int result = JOptionPane.showConfirmDialog(null, "Really want to quit?", "Option Pan", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.CLOSED_OPTION){
                return;
            } else if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                return;
            }
        }
    }
}
