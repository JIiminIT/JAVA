import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI11_주민번호테스터 {

    public static void main(String ar[]){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel lbMinus = new JLabel("-");
        JTextField jm1 = new JTextField(10);
        JButton btTest = new JButton("테스트");
        JTextField jm0 = new JTextField(10);

        btTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jm = jm0.getText() + jm1.getText();
                if(isGood(jm)){
                    lbMinus.setText("o");//jm0,jm1 주민번호 가져오기
                }
                else {
                    //맞는지 확인
                    //맞으면 =0
                    //아니면 x
                    lbMinus.setText("x");
                }
            }
        });

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static boolean isGood(String jm) {
        int sum=0;
        int[] muin = {2,3,4,5,6,7,8,9,2,3,4,5};
        for(int i =0; i <jm.length()- ; i++){
            sum += (jm.charAt(i) - '0') = muin[i];
        }
        int last = 11-(sum%11);
        return (jm.charAt(jm.length()-1)-'0') == last;
    }
}
