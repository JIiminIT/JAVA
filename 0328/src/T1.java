/* 100�̸��� ���ӵ� �� �ڸ����� ¦�� 3���� ���Ͽ�����,  4****2�� �Ǿ���. �� �� ���� �ڿ����� �������, �׸��� ����� ������ ���ϴ� ���α׷���
 * for������ �ۼ��Ͻÿ�.
 */
public class T1 {

	public static void main(String[] args) {
		int number;
		for(int i=10; i<=100; i++) { 
			number = i * (i + 2) * ( i+ 4);
			if((number/1000000==4)&&(number%10==2))
			System.out.println(i+"*"+(i+2)+"*"+	(i+4) + "*" + number);
		}
	}

}
