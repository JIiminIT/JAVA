import java.util.*;
import java.util.Random;
public class MineGame {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ��ȣ�� �����ϼ���.: 1. ���� | 2.����| 3.��");
		int me = sc.nextInt();
		
		while(true) {
		int c = (int)(Math.random()*3)+1;
		while(true) {
		
		switch (me) {
		case 1:
			
		switch(c) {
		case 1: 
			System.out.println("�����ϴ�."); break;
		case 2:
			System.out.println("�����ϴ�.");break;
		case 3:
			System.out.println("�̰���ϴ�.");break;
		}break;
			case 2:
			
			case 1: 
				System.out.println("�̰���ϴ�.");break;
			case 2:
				System.out.println("�����ϴ�.");break;
			case 3:
				System.out.println("�����ϴ�.");break;
		break;
		  
			case 3:	
		 
			case 1: 
				System.out.println("������ϴ�.");break;
			case 2:
				System.out.println("�̰���ϴ�.");break;
			case 3:
				System.out.println("����ϴ�.");break;
				break;
		}
		}
		
		
		
		
		System.out.println("�ٽ� �Ͻǲ�����?  Y|N");
		String an = sc.nextLine();
		if(an.equals("y") || an.equals("Y")) {
			continue;
		}
		else {
			break;
		}
	}
	}
	}
}
	
	
		
