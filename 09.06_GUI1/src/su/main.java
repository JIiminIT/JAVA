package su;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String ar[]) {
        //DB에 저장할 이름,,, 정보 그리고 비밀번호 입력도 넣을까.. 시작하는 버튼이랑 결과 확인 버튼 생성

        Dimension screensize = new Dimension();// 화면의 크기를 구한다.
        // 화면의 크기의 절반값에서 fram크기의 절반값을 뺀 위치로 하면 화면 가운데에 위치한다.

        // 정보 링크 추천
        //http://blog.naver.com/javaking75/140158114120

        String name;

        Font font = new Font("나눔스퀘어라운드", Font.PLAIN, 50);
        JFrame frame = new JFrame();

        JLabel title = new JLabel("퍼스널 컬러 자가진단.");

        title.setFont(font);

        JButton startbt = new JButton();
        JButton resultbt = new JButton();



        frame.add(startbt);
        frame.add(resultbt);

        JTextField tf = new JTextField();
        //tf에 이름이 들어가면 저장.

        frame.add(tf);


        frame.setPreferredSize(new Dimension(1000, 800));
        frame.pack();
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
