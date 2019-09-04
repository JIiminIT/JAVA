package 수행;// û�ҳ����� �������� �����ϱ�
// ���� �ܾ� �Է��ϱ�
// �ð� �Է��ϱ�
// ����� ������ �����ϱ�
// ������� �����ϱ�
// �պ����� �ѹ��� ������ ����
// ���߱��� ž�°��� Ƚ�� ����ϱ�
// ���������� ������ �Ϳ� ���� ������� �ΰ����� ����.

//  ���α׷��� Ű�� û�ҳ����� �������� �����Ѵ�.
//  ���� �ܾ��� �Է��Ѵ�.
//  ���߱��� �̿� ��θ� �Է��Ѵ�.
//  �ɸ��� �ð��� �Է��Ѵ�.
//  ���α׷��� ���߱��� ž�°��� Ƚ���� ����Ѵ�.
//  ����� ���� ��� ž�°������� ����� ���´�.

����;
import java.util.*;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money,age,movenum,agemoney = 0,result;
		while(true) {
		System.out.println("���̸� �Է����ּ���.");
		age = sc.nextInt();
	
	    if (age <=5) {
	      agemoney = 450;
	    }
	    else if(age <=19) {
	    	agemoney =  720;
	      }
	    else if(age <=20) {
	    	agemoney =  1250;
	      }
	    
	    System.out.println("�ܾ��� �Է����ּ���.");
		money = sc.nextInt();
		
		System.out.println("�̿��Ͻô� ��ȣ�� �Է����ּ���. ( 1.��  / 2. �պ�)  :");
		movenum =  sc.nextInt();
		
		if (movenum == 1 ) {
		      result = money / agemoney;
		      System.out.println("�̿밡�� Ƚ����"+result+"�� �Դϴ�.");
		}
		else if (movenum == 2 ) {
		      result = money / agemoney * 2;
		      System.out.println("�̿밡�� Ƚ����"+result+"�� �Դϴ�.");
		}
		
		int stop = sc.nextInt();
		System.out.println("�׸� �Ͻðڽ��ϱ�? (1.�� | n. �ƴϿ�.): ");
				  if (stop == 1) {
				    System.out.println("���α׷��� �����մϴ�.");
				    System.exit(0);
				    break;
				  }
		}
		  

	}
}