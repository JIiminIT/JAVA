import java.util.*;
public class Game {
	
	public static final int ���� = 1;
	public static final int ���� = 2;
	public static final int �� = 3;
	
	public static void main(String[] args) {
	int com,you;
	Scanner sc = new Scanner(System.in);
	String choice;
	
		while(true) {
			com = (int)(Math.random()*3)+1;
			System.out.print("���ϴ� ���� �Է�(1:���� , 2:���� , 3:��)");
			you = sc.nextInt();
			
			if(com == 1) {
				switch (you) {
				case 1:
					System.out.println("�̰���ϴ�.");
					break;
				
				case 2:
					System.out.println("�����ϴ�.");
					break;
				case 3:
					System.out.println("�����ϴ�.");
					System.out.println("1~3 ������ ������ �Է����ּ���,");
					break;


				default:
					break;
				}
			}
			else if(com == 2) {
				switch (you) {
				case 1:
					System.out.println("������ϴ�.");
					break;
				
				case 2:
					System.out.println("�����ϴ�.");
					break;
				case 3:
					System.out.println("�̰���ϴ�.");
					System.out.println("1~3 ������ ������ �Է����ּ���,");
					break;

				default:
					break;
			}
			else if(com == 3) {
				switch (you) {
				case 1:
					System.out.println("�����ϴ�.");
					break;
				
				case 2:
					System.out.println("�̰���ϴ�.");
					break;
				case 3:
					System.out.println("�����ϴ�.");
					System.out.println("1~3 ������ ������ �Է����ּ���,");
					break;


				default:
					System.out.println("1~3 ������ ���ڸ� �Է����ּ���.");
					break;
			}
			if ((you==1 && com==3)|| (you==2 && com==1)||(you==3&& com==2))//�������� ������.
				System.out.println("�¸�");
			}
			
			System.out.print("����Ͻðڽ��ϱ�? (y or n) : ");
			choice = sc.next();
			
			if (choice.equalsIgnoreCase("N")) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
				
			}
		}
	}

}
	
	static public String print(int su) {
		String choice;
		if(su==1)
			choice = "����\t";
		if(su==2)
			choice = "����\t";
		else if(su==3)
			choice = "��\t";
	}
