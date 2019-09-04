package 프로젝트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import 프로젝트.MoveNum.MyActionListener;
import 프로젝트.User.MyActionListener1;

public class Money extends JPanel {
	MainJPanel test;
	JButton btn4;
	ImageIcon img;
	JLabel labelImage;
	JLabel lblLbl;
	JTextField textField;
	int money = 0;
	
	public Money(MainJPanel test) {
		this.test = test;
		setLayout(null);//수동으로 컴포넌트를 설정할 수 있게 해준다.
		
		//버튼 생성
		btn4 = new JButton("다음");
       
        img = new ImageIcon("src/프로젝트/img/지하철역배경.jpg");
        labelImage = new JLabel(img);
        
        lblLbl = new JLabel("잔액입력 :");//라벨 생성
		lblLbl.setBounds(300,250,200,150);//x,y,xsize,ysize
		lblLbl.setFont(lblLbl.getFont().deriveFont(27.0f));//라벨 사이즈 font : 15
		add(lblLbl);//라벨추가​
	
		
		textField = new JTextField();//텍스트 생성
		textField.setBounds(450,300,250,50);//x,y,xsize,ysize
		textField.setColumns(10);
		
        btn4.setBorderPainted(false);//버튼 테두리삭제
        btn4.setBounds(450, 550, 150, 40); //x,y,xsize,ysize
     
        labelImage.setBounds(0, 0, 1000, 800);//x,y,xsize,ysize
        add(btn4);//버튼 추가
        add(labelImage);//이미지 추가
        
        add(textField);//텍스트 추가
        
        btn4.addActionListener(new MyActionListener());//버튼에 액션 효과를 넣어줌
	}
	//패널을 change를 하기 위해 액션효과를 넣어줌.
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			test.change1("btn4");//btn4를 누르면 바뀜.
		}
		
		
	}
}