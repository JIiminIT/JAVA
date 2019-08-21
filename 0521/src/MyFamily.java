
public class MyFamily {

	public static void main(String[] args) {
		
		Me me = new Me();
		GrandFa gr = new GrandFa();
		System.out.println("가보"+gr.gabo);
		System.out.println("가훈"+gr.gahun);
		System.out.println(gr.say());
		System.out.println(gr.est());
		System.out.println("할아버지 나이"+gr.getNai());
		System.out.println("=========================");
		GrandFa gr1 = new GrandFa(99); //생성자 오버로딩
		System.out.println("새할아버지 나이:"+ gr1.getNai());
		System.out.println("가보 ");
		System.out.println("===========상속 시작============");
		Father fa = new Father();
		System.out.println("아버지 나이:" + fa.getNai());
		System.out.println("아버지 집:" + fa.getHouse());
		System.out.println("가보: " + fa.gabo	);
		System.out.println(fa.say());
		System.out.println(fa.est());
		System.out.println("======================");
		fa.show();
		
		System.out.println("==========Me=========");
		Me me1 = new Me();
		
	}

}
