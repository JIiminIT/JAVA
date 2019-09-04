package 프로젝트;

������Ʈ;

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
		setLayout(null);//�������� ������Ʈ�� ������ �� �ְ� ���ش�.
		
		//��ư 2�� ����
		btn5 = new JButton("��");
        btn6 = new JButton("�պ�");
        
        //�̹��� ����
        img = new ImageIcon("src/������Ʈ/img/����ö�����.jpg");
		labelImage = new JLabel(img);
        
		//��ư �׵θ� ����
        btn5.setBorderPainted(false);
        btn6.setBorderPainted(false);
        
        lblLbl = new JLabel("���߱��� �̵� ����� �������ּ���.");//�� ����
		lblLbl.setBounds(200,250,700,150);//x,y,xsize,ysize
		lblLbl.setFont(lblLbl.getFont().deriveFont(40.0f));//�� ������ font : 15
		add(lblLbl);//���߰�
        
		//x,y,xsize,ysize(��ư ��ǥ ����)
        btn5.setBounds(350, 500, 150, 40); 
        btn6.setBounds(550, 500, 150, 40);
        labelImage.setBounds(0, 0, 1000, 800);
        
        //��ư�̶� �̹��� ����.
        add(btn5);
        add(btn6);
        add(labelImage);
        
        btn5.addActionListener(new MyActionListener());//��ư �׼�
        btn6.addActionListener(new MyActionListener());//��ư �׼�
	}
	//�г��� change�� �ϱ� ���� �׼�ȿ���� �־���.
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			test.change2("btn6");
		}
		
	}
}
