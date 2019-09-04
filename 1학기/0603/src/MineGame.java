import java.util.*;
import java.util.Random;
public class MineGame {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("낼 번호를 선택하세요.: 1. 가위 | 2.바위| 3.보");
		int me = sc.nextInt();
		
		while(true) {
		int c = (int)(Math.random()*3)+1;
		while(true) {
		
		switch (me) {
		case 1:
			
		switch(c) {
		case 1: 
			System.out.println("비겼습니다."); break;
		case 2:
			System.out.println("졌습니다.");break;
		case 3:
			System.out.println("이겼습니다.");break;
		}break;
			case 2:
			
			case 1: 
				System.out.println("이겼습니다.");break;
			case 2:
				System.out.println("비겼습니다.");break;
			case 3:
				System.out.println("졌습니다.");break;
		break;
		  
			case 3:	
		 
			case 1: 
				System.out.println("졌겼습니다.");break;
			case 2:
				System.out.println("이겼습니다.");break;
			case 3:
				System.out.println("비습니다.");break;
				break;
		}
		}
		
		
		
		
		System.out.println("다시 하실껀가욤?  Y|N");
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
	
	
		
