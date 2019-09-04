import java.util.*;
public class T1 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println(" 신호값 10자리 입력 : ");
		String num = sc.nextLine();
		int sum=0;
				
		if(num.length() != 10) {
			System.out.println("제품의 신호값이 10자리가 아닙니다.");
			System.out.println("테스트를 종료합니다.");
			System.exit(0);
		}
		
		for(int i=0; i<num.length(); i++) {
			sum += num.charAt(i) - 48;
			num.length();
		}
		if(sum % 7 ==4) {
			System.out.println("불량");
		}
		else {
			System.out.println("통과");
		}
			
		} 
	}

