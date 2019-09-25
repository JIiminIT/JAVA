import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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

        JPanel panelResult = new JPanel();
        JLabel label = new JLabel();
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
        panelResult.add(panelResult);
//   cx0.addItem('IUUUUU'); 추가하는거임

        panel.add(cx0);
       /* bt0.addActionListener(new ActionListener() {
            bt0.addActionListener(ActionEvent actionEvent) {
                bt0.setText("Clicked");
            }
        });
        */

       rb0.setSelected(true);
       cb1.setSelected(true);
       tf0.setText("전화번호를 입력하세요.");
       tf0.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
               if (tf0.getText().equals("전화번호를 입력하세요.")) {
                   tf0.setText("");
               }
           }

           @Override
           public void focusLost(FocusEvent e) {
                if (tf0.getText().equals("")){
                tf0.setText("전화번호를 입력하세요.");
           }
       };

           ItemListener il = new ItemListener() {
               @Override
               public void itemStateChanged(ItemEvent e) {
                    if(e.getSource() == cb0){
                        System.out.println("Jcheckbox0 :" + cb0.isSelected() );
                    } else if(e.getSource() == cb1){
                        System.out.println("Jcheckbox1 :" + cb1.isSelected() );
                    } else if(e.getSource() == rb0){
                        System.out.println("미성년자:" + rb0.isSelected());
                    } else if (e.getSource() == rb1){
                        System.out.println("성인:" + rb1.isSelected());
                    } else if (e.getSource() == cx0){
                        System.out.println(cx0.getSelectedItem());

                    }
               }
           };




       public void actionPerformed(ActionEvent actionEvent){
           showResult(lb0, bt0, cb0, cb1, rb0, rb1, tf0, ta0, cx0);
       }

//        frame.add(panel);
//
//        frame.setPreferredSize(new Dimension(600,400));
//        frame.pack();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    }

    private static void showResult(JLabel lb0, JButton bt0, JCheckBox cb0, JCheckBox cb1, JRadioButton rb0, JRadioButton rb1, JTextField tf0, JTextArea ta0, JComboBox cx0) {
        String result = "";
        result += lb0.getText();
        result += bt0.getText();
        result += cb0.isSelected();
        result += cb1.isSelected();
        result += rb0.isSelected();
        result += rb1.isSelected();
        result += tf0.getText();
        result += ta0.getText();
        result += cx0.getSelectedIndex();
        result += cx0.getSelectedItem();
        lbResult.cbox.getText(result);
    }

