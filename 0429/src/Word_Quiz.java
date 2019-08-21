import java.util.*;
public class Word_Quiz {

	public static void main(String[] args) {
		
		String strArr[] = {"cake", "happy", "tired", "cokie","handsome"};
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		String answer = getAnswer(strArr); 
		String question = getScrambleWord(answer);
		char hint[] = new char[answer.length()];
		
		for(int i=0; i<hint.length; i++) {
			hint[i] ='_';
		}
		
		while(true) {
		
			System.out.println("Question : " + question);
			System.out.println("Answer : " + answer );
			String input = sc.nextLine();
			
			if(input.equalsIgnoreCase("q")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			}
			else if(input.equalsIgnoreCase(answer)) {
				System.out.println("정답입니다." +"\n");
				break;
			}
			else {
				System.out.println(input + "(은)는 정답이 아닙니다.");
				System.out.println("Hint :" + getHint(answer, hint));
			}	
		}	
	}
	}
	
	private static String getHint(String answer, char hint) {
		int count =0;
		//1.반복문을 이용해서 hint 배열에서 '_'ㅡ이 갯수를 샌다.
		//2. count의 값이 2보다 클때에만 정답위 한 글자를 hint 
		//3. 정답을 다 알려주는 상황이 되지 않게 하기 위함.
		//4. [주의] 반드시 이전 힌트보다 한 글자를 더 보여줘야함.
		//5. Math.random()을 사용해서 장답의 한 글자를 hint 배열에 넣는다.
		
		for(int i=0; i<hint.length; i++) {
			if(hint[i] == '_')
				count++;
		}
		
		if(count > 2) {
			while(true) {
				int idx = (int)(Math.random() * answer.length());//idx =0~3 사이의 임의의 값.
				if(hint[idx] =='_') {
					hint[idx] = answer.charAt(idx);
					break;
				}
			}
		}
		return new String(hint);
		
	}
	
	public static String getAnswer(String strArr[]) {
		return strArr[(int)(Math.random() * strArr.length)];
	}
	
	public static String getScrambleWord(String str) {

		char[] charr = str.toCharArray();
		
		for(int i=0; i<10; i++) {
	
			int idx = (int)(Math.random() * str.length());
			char temp =charr[0];
			charr[0] = charr[idx];
			charr[idx] = temp;
		}
		return new String(charr);
	}
	
	
	
}

	
	//1. 화면을 통해 사용자의 입력을 받는다.(Scanner 클래스사용)
	//2. 사용자가 q 또는 Q를 입력하면 프로그램을 종료한다. (equals() 메서드 사용)
	//3. 사용자가 정답을 맞출때까지 반복한다. (while문 사용) 무한반복이기때문에 while(0)을 해야한다.
	//4. 사용자가 정답을 맞추면, while문을 빠져나간다.
	//5. 2중 while문 사용.

