import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUi2_Components {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox cb0 = new JCheckBox("JCheckBox0");
        JCheckBox cb1 = new JCheckBox("JCheckBox1");
        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();//버튼을 하나로 그룹해서 취급한다.
        bg.add(rb0);
        bg.add(rb1);

        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2,10);
        String[] name={"IU", "IUU", "IUUU", "IUUUU"};
        JComboBox cx0 = new JComboBox(name);

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(cb1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
//   cx0.addItem('IUUUUU'); 추가하는거임


        panel.add(cx0);

       /* bt0.addActionListener(new ActionListener() {
            bt0.addActionListener(ActionEvent actionEvent) {
                bt0.setText("Clicked");
            }
        });
        */

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

