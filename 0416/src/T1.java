import java.util.*;
public class T1 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println(" ��ȣ�� 10�ڸ� �Է� : ");
		String num = sc.nextLine();
		int sum=0;
				
		if(num.length() != 10) {
			System.out.println("��ǰ�� ��ȣ���� 10�ڸ��� �ƴմϴ�.");
			System.out.println("�׽�Ʈ�� �����մϴ�.");
			System.exit(0);
		}
		
		for(int i=0; i<num.length(); i++) {
			sum += num.charAt(i) - 48;
			num.length();
		}
		if(sum % 7 ==4) {
			System.out.println("�ҷ�");
		}
		else {
			System.out.println("���");
		}
			
		} 
	}

