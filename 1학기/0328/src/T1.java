/* 100미만의 연속된 두 자릿수의 짝수 3개를 곱하였더니,  4****2가 되었다. 이 세 개의 자연슈는 어떤수인지, 그리고 결과는 얼마인지 구하는 프로그램을
 * for문으로 작성하시오.
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
