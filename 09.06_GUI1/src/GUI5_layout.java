import javax.swing.*;
import java.awt.*;

public class GUI5_layout   {
        public static void main(String ar[]) {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    BorderLayout b = new  BorderLayout(2,4);
    panel.setLayout(b);

    JButton bt0 = new JButton("Button"+0);
    JButton bt1 = new JButton("Button"+1);
    JButton bt2 = new JButton("Button"+2);
    JButton bt3 = new JButton("Button"+3);
    JButton bt4 = new JButton("Button"+4);
    JButton bt5 = new JButton("Button"+5);
//
//    panel.add(bt0,BorderLayout.NORTH);
//    panel.add(bt1,BorderLayout.NORTH);
//    panel.add(bt2,BorderLayout.EAST);
//    panel.add(bt3,BorderLayout.WEST;
//    panel.add(bt4,BorderLayout.CENTER);
//    panel.add(bt5,BorderLayout.CENTER);

//    for (int i = 0; i < 6; i++) {
//        Button bt = new Button("Button" + i);
//        panel.add(bt,);
//    }

    frame.add(panel);
    frame.setPreferredSize(new Dimension(600, 400));
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
