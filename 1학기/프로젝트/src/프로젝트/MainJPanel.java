package 프로젝트;

������Ʈ;
//���� �����ϰ� �ִ� �ܾ����� ���߱����� n�� �̿��� �������� �˷��ִ� ����Դϴ�.
//MainJPanel ���� �����Ͽ� User->Money->MoveNum -> Result ������ ����˴ϴ�.
import javax.swing.*;

public class MainJPanel extends JFrame {
	
	//�ʱ�ȭ
	public User user = null; 
	public Money money = null;
	public MoveNum movenum = null;
	public Result result = null;
	public int agemoney = 0, Mresult = 0, Mmoney = 0;
	
	
	public void change(String User) {//��ư�� �������� ü����
		if(User.equals("btn1")) { // User class ��ư 1�� ��������
			agemoney = 450;//450 ��
			getContentPane().removeAll(); //�����͸� ������.
			getContentPane().add(money);//money�� �Ѿ
			revalidate();//validate() ,invalidate()[â �ȿ� �ڸ���� �ִ� ������ ������Ʈ�� �����̳ʵ��� ���̾ƿ��� ���缭 ����� ������ �ʿ��Ҷ�]�ΰ����� �� ���� �����ϰ� ������ �ÿ�
			repaint();//update() �޼ҵ带 �ڵ�ȣ��
		}
	else if(User.equals("btn2")) { //User class ��ư 2�� ��������
		agemoney = 720;//720�� ��
		getContentPane().removeAll(); //�����͸� ������.
		getContentPane().add(money);//money�� �Ѿ
		revalidate();//
		repaint();//update() �޼ҵ带 �ڵ�ȣ��
	}
	
	else if(User.equals("btn3")) { //User class ��ư 3�� ��������
		agemoney = 1250;//1250�� ��
		getContentPane().removeAll();//�����͸� ������.
		getContentPane().add(money);//money�� �Ѿ
		revalidate();
		repaint();//update() �޼ҵ带 �ڵ�ȣ��
	}
	}
	
	public void change1(String Money) {
		if(Money.equals("btn4")) { //money class ��ư 4�� ��������
			Mmoney = Integer.parseInt(money.textField.getText());//�Է��� ���� int Ÿ������ ��ȯ��Ŵ.
			getContentPane().removeAll();//�����͸� ������.
			getContentPane().add(movenum);//movenum�� �Ѿ
			revalidate();
			repaint();//update() �޼ҵ带 �ڵ�ȣ��
		}
	}
	
	public void change2(String Movenum) {
		if(Movenum.equals("btn5 ")) { //movenum class ��ư 5�� ��������
			Mresult = Mmoney / agemoney; //����� = �ܾ� ������ ���
			getContentPane().removeAll(); //�����͸� ������.
			getContentPane().add(result); //result�� �Ѿ
			add(result.resultLabel(Mresult));
			revalidate();
			repaint();//update() �޼ҵ带 �ڵ�ȣ��
		}
		else if(Movenum.equals("btn6")) { //movenum class ��ư 6�� ��������
			Mresult = Mmoney / agemoney / 2;//����� = �ܾ� ������ ��� ������ 2
			getContentPane().removeAll(); //�����͸� ������.
			getContentPane().add(result);//result�� �Ѿ
			add(result.resultLabel(Mresult));
			revalidate();
			repaint();//update() �޼ҵ带 �ڵ�ȣ��
		}
	}
	
	

	public static void main(String[] args) {
		
		//��ü�� �����մϴ�.
		MainJPanel test = new MainJPanel();
		
		test.setTitle("���߱��� ž�°��� Ƚ�� ����");//Ÿ��Ʋ �̸�
		//ȣ���ϱ� 
		test.user = new User(test);
		test.money = new Money(test);
		test.movenum = new MoveNum(test);
		test.result = new Result(test);
		
		
		test.add(test.user);//�ǳ� �߰�
		test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// â �ݱ�
		test.setSize(1000,800);//������  1000x800
		test.setVisible(true);//�������� �����ִ� ������ �Ѵ�.
	}

}
