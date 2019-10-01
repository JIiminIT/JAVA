import javax.swing.*;
import java.awt.*;

public class GUI3_layout {
    public static void main(String ar[]) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.LEFT);
        panel.setLayout(fl);

        for (int i = 0; i < 9; i++) {
            Button bt = new Button("Button" + i);
            panel.add(bt);
        }
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
