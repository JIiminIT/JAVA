import java.util.*;
public class Game {
	
	public static final int 가위 = 1;
	public static final int 바위 = 2;
	public static final int 보 = 3;
	
	public static void main(String[] args) {
	int com,you;
	Scanner sc = new Scanner(System.in);
	String choice;
	
		while(true) {
			com = (int)(Math.random()*3)+1;
			System.out.print("원하는 값을 입력(1:가위 , 2:바위 , 3:보)");
			you = sc.nextInt();
			
			if(com == 1) {
				switch (you) {
				case 1:
					System.out.println("이겼습니다.");
					break;
				
				case 2:
					System.out.println("비겼습니다.");
					break;
				case 3:
					System.out.println("졌습니다.");
					System.out.println("1~3 사이의 정수만 입력해주세요,");
					break;


				default:
					break;
				}
			}
			else if(com == 2) {
				switch (you) {
				case 1:
					System.out.println("졌겼습니다.");
					break;
				
				case 2:
					System.out.println("비겼습니다.");
					break;
				case 3:
					System.out.println("이겼습니다.");
					System.out.println("1~3 사이의 정수만 입력해주세요,");
					break;

				default:
					break;
			}
			else if(com == 3) {
				switch (you) {
				case 1:
					System.out.println("비겼습니다.");
					break;
				
				case 2:
					System.out.println("이겼습니다.");
					break;
				case 3:
					System.out.println("졌습니다.");
					System.out.println("1~3 사이의 정수만 입력해주세요,");
					break;


				default:
					System.out.println("1~3 사이의 숫자만 입력해주세요.");
					break;
			}
			if ((you==1 && com==3)|| (you==2 && com==1)||(you==3&& com==2))//가독성이 떨어짐.
				System.out.println("승리");
			}
			
			System.out.print("계속하시겠습니까? (y or n) : ");
			choice = sc.next();
			
			if (choice.equalsIgnoreCase("N")) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				
			}
		}
	}

}
	
	static public String print(int su) {
		String choice;
		if(su==1)
			choice = "가위\t";
		if(su==2)
			choice = "바위\t";
		else if(su==3)
			choice = "보\t";
	}
