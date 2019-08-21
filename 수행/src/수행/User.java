// 청소년인지 성인인지 선택하기
// 현재 잔액 입력하기
// 시간 입력하기
// 출발지 도착지 설정하기
// 교통수단 선택하기
// 왕복인지 한번만 가는지 선택
// 대중교통 탑승가능 횟수 계산하기
// 마지막으로 선택한 것에 따라 결과값이 두가지로 나뉨.

//  프로그램을 키고 청소년인지 성인인지 선택한다.
//  현재 잔액을 입력한다.
//  대중교통 이용 경로를 입력한다.
//  걸리는 시간을 입력한다.
//  프로그램이 대중교통 탑승가능 횟수를 계산한다.
//  결과를 보고 몇번 탑승가능한지 결과가 나온다.
package 수행;
import java.util.*;
public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money,age,movenum,agemoney = 0,result;
		while(true) {
		System.out.println("나이를 입력해주세요.");
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
	    
	    System.out.println("잔액을 입력해주세요.");
		money = sc.nextInt();
		
		System.out.println("이용하시는 번호를 입력해주세요. ( 1.편도  / 2. 왕복)  :");
		movenum =  sc.nextInt();
		
		if (movenum == 1 ) {
		      result = money / agemoney;
		      System.out.println("이용가능 횟수는"+result+"번 입니다.");
		}
		else if (movenum == 2 ) {
		      result = money / agemoney * 2;
		      System.out.println("이용가능 횟수는"+result+"번 입니다.");
		}
		
		int stop = sc.nextInt();
		System.out.println("그만 하시겠습니까? (1.네 | n. 아니요.): ");
				  if (stop == 1) {
				    System.out.println("프로그램을 종료합니다.");
				    System.exit(0);
				    break;
				  }
		}
		  

	}
}