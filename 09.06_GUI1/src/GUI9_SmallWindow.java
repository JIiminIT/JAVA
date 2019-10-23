import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI9_SmallWindow {
    public static void main(String ar[]){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton bt0 = new JButton("작은 창1");
        JButton bt1 = new JButton("작은 창2");

        JDialog dialog = new JDialog(frame, "다이얼로그",true);
        JLabel lb = new JLabel("레이블");
        dialog.add(lb);
        dialog.setSize(new Dimension(100,200));

       // bt0.addActionListener(new ActionListener() {...});
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hi");
            }
        });

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "메세지","제목",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                int select = JOptionPane.showConfirmDialog(frame, null,"저장할까요?",);
//                System.out.println(select);

                String luckynimber = JOptionPane.showInputDialog(frame,"너의 행운의 번호는?");
                System.out.println(luckynimber);
            }
        });
        frame.add(panel);
        panel.add(bt0);
        panel.add(bt1);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
