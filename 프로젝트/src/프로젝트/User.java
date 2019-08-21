package 프로젝트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import 프로젝트.Money.MyActionListener;

public class User extends JPanel {
	MainJPanel test;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JLabel lblLbl;
	ImageIcon img;
	JLabel labelImage;
	
	public User(MainJPanel test) {
		this.test = test;
		setLayout(null);//수동으로 컴포넌트를 설정할 수 있게 해준다.
		
		//버튼 3개 생성
		btn1 = new JButton("어린이");
        btn2 = new JButton("청소년");
        btn3 = new JButton("성인");
        
        //배경 이미지 생성
        img = new ImageIcon("src/프로젝트/img/지하철역배경.jpg");
		labelImage = new JLabel(img);
        
		//버튼 테두리 제거
        btn1.setBorderPainted(false);
        btn2.setBorderPainted(false);
        btn3.setBorderPainted(false);
        
      //x,y,xsize,ysize(좌표설정)
        btn1.setBounds(250, 550, 150, 40); 
        btn2.setBounds(430, 550, 150, 40);
        btn3.setBounds(610, 550, 150, 40);
        labelImage.setBounds(0, 0, 1000, 800);
        
        //라벨 생성
        lblLbl = new JLabel("연령대를 선택해주세요.");//라벨 생성
      //x,y,xsize,ysize(라벨 좌표)
		lblLbl.setBounds(280,250,2000,150);
		//라벨 사이즈 font : 15
		lblLbl.setFont(lblLbl.getFont().deriveFont(45.0f));
		add(lblLbl);//라벨추가
		
		//버튼 추가
        add(btn1);
        add(btn2);
        add(btn3);
        //이미지 추가
        add(labelImage);
        
        //버튼에 액션 효과를 넣어줌
        btn1.addActionListener(new MyActionListener1());
        btn2.addActionListener(new MyActionListener2());
        btn3.addActionListener(new MyActionListener3());
	}
	//패널을 change를 하기 위해 액션효과를 넣어줌.
	class MyActionListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			test.change("btn1");
		}
		
	}
	class MyActionListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			test.change("btn2");
		}
		
	}
	class MyActionListener3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			test.change("btn3");
		}
		
	}
}
