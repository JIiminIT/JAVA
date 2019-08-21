package 프로젝트;
//현재 소지하고 있는 잔액으로 대중교통을 n번 이용이 가능한지 알려주는 기능입니다.
//MainJPanel 에서 실행하여 User->Money->MoveNum -> Result 순서로 진행됩니다.
import javax.swing.*;

public class MainJPanel extends JFrame {
	
	//초기화
	public User user = null; 
	public Money money = null;
	public MoveNum movenum = null;
	public Result result = null;
	public int agemoney = 0, Mresult = 0, Mmoney = 0;
	
	
	public void change(String User) {//버튼을 눌렀을시 체인지
		if(User.equals("btn1")) { // User class 버튼 1을 눌렀을때
			agemoney = 450;//450 들어감
			getContentPane().removeAll(); //데이터를 삭제함.
			getContentPane().add(money);//money로 넘어감
			revalidate();//validate() ,invalidate()[창 안에 자리잡고 있는 각각의 컴포넌트와 컨테이너들이 레이아웃에 맞춰서 사이즈가 변경이 필요할때]두가지를 한 번에 실행하고 싶을때 시용
			repaint();//update() 메소드를 자동호출
		}
	else if(User.equals("btn2")) { //User class 버튼 2을 눌렀을때
		agemoney = 720;//720이 들어감
		getContentPane().removeAll(); //데이터를 삭제함.
		getContentPane().add(money);//money로 넘어감
		revalidate();//
		repaint();//update() 메소드를 자동호출
	}
	
	else if(User.equals("btn3")) { //User class 버튼 3을 눌렀을때
		agemoney = 1250;//1250이 들어감
		getContentPane().removeAll();//데이터를 삭제함.
		getContentPane().add(money);//money로 넘어감
		revalidate();
		repaint();//update() 메소드를 자동호출
	}
	}
	
	public void change1(String Money) {
		if(Money.equals("btn4")) { //money class 버튼 4을 눌렀을때
			Mmoney = Integer.parseInt(money.textField.getText());//입력한 값은 int 타입으로 변환시킴.
			getContentPane().removeAll();//데이터를 삭제함.
			getContentPane().add(movenum);//movenum로 넘어감
			revalidate();
			repaint();//update() 메소드를 자동호출
		}
	}
	
	public void change2(String Movenum) {
		if(Movenum.equals("btn5 ")) { //movenum class 버튼 5를 눌렀을때
			Mresult = Mmoney / agemoney; //결과값 = 잔액 나누기 요금
			getContentPane().removeAll(); //데이터를 삭제함.
			getContentPane().add(result); //result로 넘어감
			add(result.resultLabel(Mresult));
			revalidate();
			repaint();//update() 메소드를 자동호출
		}
		else if(Movenum.equals("btn6")) { //movenum class 버튼 6를 눌렀을때
			Mresult = Mmoney / agemoney / 2;//결과값 = 잔액 나누기 요금 나누기 2
			getContentPane().removeAll(); //데이터를 삭제함.
			getContentPane().add(result);//result로 넘어감
			add(result.resultLabel(Mresult));
			revalidate();
			repaint();//update() 메소드를 자동호출
		}
	}
	
	

	public static void main(String[] args) {
		
		//객체를 생성합니다.
		MainJPanel test = new MainJPanel();
		
		test.setTitle("대중교통 탑승가는 횟수 계산기");//타이틀 이름
		//호출하기 
		test.user = new User(test);
		test.money = new Money(test);
		test.movenum = new MoveNum(test);
		test.result = new Result(test);
		
		
		test.add(test.user);//판넬 추가
		test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 창 닫기
		test.setSize(1000,800);//사이즈  1000x800
		test.setVisible(true);//프레임을 보여주는 역할을 한다.
	}

}
