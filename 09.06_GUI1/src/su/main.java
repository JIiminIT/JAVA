package su;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String ar[]){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
