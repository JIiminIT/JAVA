package 프로젝트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MoveNum extends JPanel {
	MainJPanel test;
	JButton btn5;
	JButton btn6;
	ImageIcon img;
	JLabel labelImage;
	JLabel lblLbl;
	
	public MoveNum(MainJPanel test) {
		this.test = test;
		setLayout(null);//수동으로 컴포넌트를 설정할 수 있게 해준다.
		
		//버튼 2개 생성
		btn5 = new JButton("편도");
        btn6 = new JButton("왕복");
        
        //이미지 생성
        img = new ImageIcon("src/프로젝트/img/지하철역배경.jpg");
		labelImage = new JLabel(img);
        
		//버튼 테두리 제거
        btn5.setBorderPainted(false);
        btn6.setBorderPainted(false);
        
        lblLbl = new JLabel("대중교통 이동 방법을 선택해주세요.");//라벨 생성
		lblLbl.setBounds(200,250,700,150);//x,y,xsize,ysize
		lblLbl.setFont(lblLbl.getFont().deriveFont(40.0f));//라벨 사이즈 font : 15
		add(lblLbl);//라벨추가
        
		//x,y,xsize,ysize(버튼 좌표 설정)
        btn5.setBounds(350, 500, 150, 40); 
        btn6.setBounds(550, 500, 150, 40);
        labelImage.setBounds(0, 0, 1000, 800);
        
        //버튼이랑 이미지 생성.
        add(btn5);
        add(btn6);
        add(labelImage);
        
        btn5.addActionListener(new MyActionListener());//버튼 액션
        btn6.addActionListener(new MyActionListener());//버튼 액션
	}
	//패널을 change를 하기 위해 액션효과를 넣어줌.
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			test.change2("btn6");
		}
		
	}
}
