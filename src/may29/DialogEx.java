//package may29;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class DialogEx extends JFrame {
//    private MyModalDialog dialog;
//    public DialogEx(){
//        super("DiaglogEx Example Frame");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JButton btn = new JButton("Show Dialog");
//        dialog = new MyModalDialog(this, "Test Dialog");
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                dialog.setVisible(true);
//            }
//        });
//        getContentPane().add(btn);
//        setSize(250, 200);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new DialogEx();
//    }
//}
//
//class MyModalDialog extends JDialog {
//    private JTextField tf = new JTextField(10);
//    private JButton okButton = new JButton("OK");
//
//    public MyModalDialog(JFrame frame, String title) {
//        super(frame, title);
//        setLayout(new FlowLayout());
//        add(tf);
//        add(okButton);
//        setSize(200, 100);
//
//        okButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                setVisible(false);
//            }
//        });
//    }
//}
