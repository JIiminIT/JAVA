package 프로젝트;

������Ʈ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import ������Ʈ.MoveNum.MyActionListener;

public class Result extends JPanel {
	MainJPanel test;
	
	public JLabel resultLabel(int result) {//�� ������ ������ �ݴϴ�.
		JLabel lblLbl = new JLabel("���߱��� �̿� ������ Ƚ���� "+result+"�� �Դϴ�."); //������� �߰� ���ݴϴ�.
		lblLbl.setBounds(300,250,700,150);//x,y,xsize,ysize
		lblLbl.setFont(lblLbl.getFont().deriveFont(40.0f));//��Ʈ ����� 40���� �������ݴϴ�.
		return lblLbl;// lblLbl�� �������ݴϴ�.
	}
	public Result(MainJPanel test) {
		this.test = test;
		setLayout(null);//�������� ������Ʈ�� ������ �� �ְ� ���ش�.
   
	}
	
	
}
