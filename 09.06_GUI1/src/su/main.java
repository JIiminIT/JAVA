package su;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String ar[]) {
        //DB에 저장할 이름,,, 정보 그리고 비밀번호 입력도 넣을까.. 시작하는 버튼이랑 결과 확인 버튼 생성
        String name;

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton startbt = new JButton();
        JButton resultbt = new JButton();

        JTextField tf = new JTextField();

        frame.add(tf);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
