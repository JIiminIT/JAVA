
public class MyFamily {

	public static void main(String[] args) {
		
		Me me = new Me();
		GrandFa gr = new GrandFa();
		System.out.println("����"+gr.gabo);
		System.out.println("����"+gr.gahun);
		System.out.println(gr.say());
		System.out.println(gr.est());
		System.out.println("�Ҿƹ��� ����"+gr.getNai());
		System.out.println("=========================");
		GrandFa gr1 = new GrandFa(99); //������ �����ε�
		System.out.println("���Ҿƹ��� ����:"+ gr1.getNai());
		System.out.println("���� ");
		System.out.println("===========��� ����============");
		Father fa = new Father();
		System.out.println("�ƹ��� ����:" + fa.getNai());
		System.out.println("�ƹ��� ��:" + fa.getHouse());
		System.out.println("����: " + fa.gabo	);
		System.out.println(fa.say());
		System.out.println(fa.est());
		System.out.println("======================");
		fa.show();
		
		System.out.println("==========Me=========");
		Me me1 = new Me();
		
	}

}
