class Top extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i =0; i<50; i++) {
			System.out.print(i+"\t");
		}
	}
	
}
public class Thread1Exam {

	public static void main(String[] args) {
	System.out.println("프로그램 시작");
	Top d = new Top();
	Top d2 = new Top();
	d.run();
	d2.run();
	System.out.println("프로그램 종료");

	}

}
