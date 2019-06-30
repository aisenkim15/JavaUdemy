package may28;

import javax.swing.*;

public class MenuBarView extends JFrame {
    public MenuBarView(){
        setTitle(";;");
        createMenu2();
        setSize(250, 200);
        setVisible(true);
    }

    public void createMenu2(){
        JMenuBar mb = new JMenuBar();

        JMenu screenMenu1 = new JMenu("파일");
        JMenu screenMenu2 = new JMenu("편집");
        JMenu screenMenu3 = new JMenu("보기");
        JMenu screenMenu4 = new JMenu("입력");

        screenMenu3.add(new JMenuItem("화면확대"));
        screenMenu3.add(new JMenu("쪽윤곽"));

        mb.add(screenMenu1);
        mb.add(screenMenu2);
        mb.add(screenMenu3);
        mb.add(screenMenu4);

        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuBarView();
    }
}
