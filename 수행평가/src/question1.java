import javax.swing.*;
import java.awt.*;

public class question1 {

    public static void main(String ar[]) {

        ImageIcon yellowskin = new ImageIcon("src/img/노란피부.PNG");

        Font font = new Font("맑은고딕", Font.BOLD, 20);
        String choice1;

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setLocation(500, 100);
        frame.setPreferredSize(new Dimension(1000, 800));

        JLabel label = new JLabel("본인의 피부색은?");

        JButton qbt1_A_C = new JButton("A,C");
        JButton qbt1_B_D = new JButton("B,D");

        panel.setLayout(null);

        qbt1_A_C.setBounds(200, 450, 150, 40);
        qbt1_B_D.setBounds(600, 450, 150, 40);
        label.setBounds(400, 50, 500, 40);

        label.setFont(font);

        panel.add(label);
        panel.add(qbt1_A_C);
        panel.add(qbt1_B_D);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
