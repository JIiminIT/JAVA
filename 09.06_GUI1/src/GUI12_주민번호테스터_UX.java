import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI12_주민번호테스터_UX {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JTextField jm0 = new JTextField(10);
        JLabel lbMinus = new JLabel("-");
        JTextField jm1 = new JTextField(10);
        JButton btTest = new JButton("테스트");

        jm0.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(jm0.getText().length() == 6){
                    jm1.requestFocus();
                }
            }
        });

        jm1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(jm1.getText().length() ==7){
                    jm1.requestFocus();
                }
            }
        });

        btTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //jm0, jm1에 주민번호 가져오기
                String jm = jm0.getText()+jm1.getText();

                //맞는지 확인하자
                if(isGood(jm)==true) { //isGood(jm)
                    //맞으면 lbMinus = "O"
                    lbMinus.setText("O");
                }else{
                    //틀리면 lbMinus = "X"
                    lbMinus.setText("X");
                }
            }
        });

        panel.add(jm0);
        panel.add(lbMinus);
        panel.add(jm1);
        panel.add(btTest);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static boolean isGood(String jm) {
        int[] mulN = {2,3,4,5,6,7,8,9,2,3,4,5};
        int sum=0;
        for(int i = 0;i<jm.length()-1;i++){
            sum+=(jm.charAt(i) - '0')*mulN[i];
        }
        //System.out.println(sum);

        int last = (11 - (sum % 11)) % 10; //10일때 한자리 써져야하므로 a 구하자

        return (jm.charAt(jm.length()-1)-'0') == last;
    }
}
