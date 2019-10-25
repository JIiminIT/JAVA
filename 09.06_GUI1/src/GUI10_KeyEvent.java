//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//public class GUI10_KeyEvent {
//    public void main(String ar[]){
//        JFrame frame = new JFrame();
//        JPanel panel = new JPanel();
//        JTextField tf0 = new JTextField(10);
//        JLabel lb = new JLabel("-");
//        JTextField tf1 = new JTextField(10);
//
//        public void KeyTypeed(KeyEvent)
//        tf0.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                if(KeyEvent.getKeyCode() == KeyEvent.VK_LEFT){
//                    tf1.setText("왼쪽 키 눌림.");
//                    tf0.setText("");
//                }
//                else if(KeyEvent.getKeyCode() == KeyEvent.VK_RIGHT){
//                    tf1.setText("오른쪽 키 눌림.");
//                }
//                else if(KeyEvent.getKeyCode() == KeyEvent.VK_UP){
//                    tf1.setText("위 키 눌림.");
//                }
////                else if(KeyEvent.getKeyCode() == KeyEvent.VK_DOWN){
////                    tf1.setText("아래 키 눌림.");
////                }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                if(e.getKeyChar() == 'p');
//                System.out.println("뀨");
//            }
//        });
//        panel.add(tf0);
//        panel.add(lb);
//        panel.add(tf1);
//        frame.add(panel);
//
//        frame.add(panel);
//
//        frame.setPreferredSize(new Dimension(600,400));
//        frame.pack();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//}
