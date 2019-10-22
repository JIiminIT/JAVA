import javax.swing.*;
import java.awt.*;

public class GUI8_Imge {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Components");
            JPanel panel = new JPanel();

            BorderLayout bl = new BorderLayout();
            panel.setLayout(bl);

            JLabel lbTitle = new JLabel("아 마 스 빈");
            lbTitle.setHorizontalAlignment(JLabel.CENTER);
            JTextArea taList = new JTextArea(1,30);
            JPanel eastPanel = new JPanel();
            ImageIcon iiJpg = new ImageIcon(GUI8_Imge.class.getResource("img/Youtube.png"));
            ImageIcon iijpg_edit = new ImageIcon( iiJpg.getImage().getScaledInstance(iiJpg.getIconWidth()/10,
                    iiJpg.getIconHeight()/10, Image.SCALE_DEFAULT));
            int sum = 10000;
            JLabel lbSum = new JLabel("총금액: "+sum);
            JButton btPayment = new JButton("결제하기");
            JButton lbii = new JButton(iijpg_edit);

            eastPanel.add(lbSum);
            eastPanel.add(btPayment);
            panel.add(lbii);
            panel.add(lbTitle,BorderLayout.NORTH);
            panel.add(taList,BorderLayout.CENTER);
            panel.add(eastPanel,BorderLayout.EAST);

            frame.add(panel);

            frame.setPreferredSize(new Dimension(600, 400));
            frame.pack();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }




