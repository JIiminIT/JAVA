package 프로젝트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import 프로젝트.MoveNum.MyActionListener;

public class Result extends JPanel {
	MainJPanel test;
	
	public JLabel resultLabel(int result) {//라벨 생성을 생성해 줍니다.
		JLabel lblLbl = new JLabel("대중교통 이용 가능한 횟수는 "+result+"번 입니다."); //결과값은 뜨게 해줍니다.
		lblLbl.setBounds(300,250,700,150);//x,y,xsize,ysize
		lblLbl.setFont(lblLbl.getFont().deriveFont(40.0f));//폰트 사이즈를 40으로 설정해줍니다.
		return lblLbl;// lblLbl을 리턴해줍니다.
	}
	public Result(MainJPanel test) {
		this.test = test;
		setLayout(null);//수동으로 컴포넌트를 설정할 수 있게 해준다.
   
	}
	
	
}
