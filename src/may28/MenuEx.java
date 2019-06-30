package may28;

import javax.swing.*;

public class MenuEx extends JFrame {
    public MenuEx(){
        setTitle(";;");
        createMenu();
        setSize(250, 200);
        setVisible(true);
    }

    private void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu = new JMenu("Screen");

        screenMenu.add(new JMenuItem("Load"));
        screenMenu.add(new JMenu("Hide"));
        screenMenu.add(new JMenu("ReShow"));
        screenMenu.addSeparator();
        screenMenu.add(new JMenuItem("Exit"));

        mb.add(screenMenu);
        mb.add(new JMenu("edit"));
        mb.add(new JMenu("source"));
        mb.add(new JMenu("Project"));
        mb.add(new JMenu("Run"));

        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuEx();
    }
}
