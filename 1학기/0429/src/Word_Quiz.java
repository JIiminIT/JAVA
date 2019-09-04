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
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			}
			else if(input.equalsIgnoreCase(answer)) {
				System.out.println("�����Դϴ�." +"\n");
				break;
			}
			else {
				System.out.println(input + "(��)�� ������ �ƴմϴ�.");
				System.out.println("Hint :" + getHint(answer, hint));
			}	
		}	
	}
	}
	
	private static String getHint(String answer, char hint) {
		int count =0;
		//1.�ݺ����� �̿��ؼ� hint �迭���� '_'���� ������ ����.
		//2. count�� ���� 2���� Ŭ������ ������ �� ���ڸ� hint 
		//3. ������ �� �˷��ִ� ��Ȳ�� ���� �ʰ� �ϱ� ����.
		//4. [����] �ݵ�� ���� ��Ʈ���� �� ���ڸ� �� ���������.
		//5. Math.random()�� ����ؼ� ����� �� ���ڸ� hint �迭�� �ִ´�.
		
		for(int i=0; i<hint.length; i++) {
			if(hint[i] == '_')
				count++;
		}
		
		if(count > 2) {
			while(true) {
				int idx = (int)(Math.random() * answer.length());//idx =0~3 ������ ������ ��.
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

	
	//1. ȭ���� ���� ������� �Է��� �޴´�.(Scanner Ŭ�������)
	//2. ����ڰ� q �Ǵ� Q�� �Է��ϸ� ���α׷��� �����Ѵ�. (equals() �޼��� ���)
	//3. ����ڰ� ������ ���⶧���� �ݺ��Ѵ�. (while�� ���) ���ѹݺ��̱⶧���� while(0)�� �ؾ��Ѵ�.
	//4. ����ڰ� ������ ���߸�, while���� ����������.
	//5. 2�� while�� ���.

