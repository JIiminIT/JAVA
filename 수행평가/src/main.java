import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String ar[]) {

        Font font = new Font("맑은고딕", Font.BOLD, 18);

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Personal Color", JLabel.CENTER);
        JButton startbt = new JButton("시작하기");
        JButton resultbt = new JButton("결과보기");

        frame.setLocation(500, 100);
        frame.setPreferredSize(new Dimension(1000, 800));

        panel.setLayout(null);

        label.setFont(font);
        label.setBounds(400, 300, 150, 40);
        startbt.setBounds(400, 460, 150, 40);
        resultbt.setBounds(400, 550, 150, 40);

        panel.add(label);
        panel.setBackground(new Color(239, 149, 153));
        panel.add(startbt);
        panel.add(resultbt);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
