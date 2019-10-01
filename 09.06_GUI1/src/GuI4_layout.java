import javax.swing.*;
import java.awt.*;

public class GuI4_layout {
    public static void main(String ar[]) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        GridLayout gr = new  GridLayout(2,4);
        panel.setLayout(gr);


        for (int i = 0; i < 6; i++) {
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
