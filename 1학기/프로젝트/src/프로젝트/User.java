package 프로젝트;

������Ʈ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import ������Ʈ.Money.MyActionListener;

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
		setLayout(null);//�������� ������Ʈ�� ������ �� �ְ� ���ش�.
		
		//��ư 3�� ����
		btn1 = new JButton("���");
        btn2 = new JButton("û�ҳ�");
        btn3 = new JButton("����");
        
        //��� �̹��� ����
        img = new ImageIcon("src/������Ʈ/img/����ö�����.jpg");
		labelImage = new JLabel(img);
        
		//��ư �׵θ� ����
        btn1.setBorderPainted(false);
        btn2.setBorderPainted(false);
        btn3.setBorderPainted(false);
        
      //x,y,xsize,ysize(��ǥ����)
        btn1.setBounds(250, 550, 150, 40); 
        btn2.setBounds(430, 550, 150, 40);
        btn3.setBounds(610, 550, 150, 40);
        labelImage.setBounds(0, 0, 1000, 800);
        
        //�� ����
        lblLbl = new JLabel("���ɴ븦 �������ּ���.");//�� ����
      //x,y,xsize,ysize(�� ��ǥ)
		lblLbl.setBounds(280,250,2000,150);
		//�� ������ font : 15
		lblLbl.setFont(lblLbl.getFont().deriveFont(45.0f));
		add(lblLbl);//���߰�
		
		//��ư �߰�
        add(btn1);
        add(btn2);
        add(btn3);
        //�̹��� �߰�
        add(labelImage);
        
        //��ư�� �׼� ȿ���� �־���
        btn1.addActionListener(new MyActionListener1());
        btn2.addActionListener(new MyActionListener2());
        btn3.addActionListener(new MyActionListener3());
	}
	//�г��� change�� �ϱ� ���� �׼�ȿ���� �־���.
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
