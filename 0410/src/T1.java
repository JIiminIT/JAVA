/*1116,2556,2880 ó�� ���� �ڸ��� ���� �ڸ��� �������� 4�ڸ� �����߿��� 9�� ����� ��� ����Ͻÿ� �� ������ ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ������� ���ٿ� 10��*/

public class T1 {

	public static void main(String[] args) {
		int h,t;
		for(int i = 1000; i <= 9999; i++) {
			 h = (1/100) % 10;
			 t = (i/10)	% 10;
			 //subString�� ����...
			 if((h==t)&&(i%5==0)){
				// count++;
					 System.out.println("�����ڸ� =" + h +", �����ڸ�" + t);
			//if(count%10==0) {
				System.out.println();
			}
		}
	}
	}
//}
