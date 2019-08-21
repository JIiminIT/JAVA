/*1116,2556,2880 처럼 백의 자리와 십의 자리가 같은수인 4자리 숫자중에서 9의 배수를 모두 출력하시오 그 개수도 세어서 출력하는 프로그램을 작성하시오.
 * 결과값은 한줄에 10개*/

public class T1 {

	public static void main(String[] args) {
		int h,t;
		for(int i = 1000; i <= 9999; i++) {
			 h = (1/100) % 10;
			 t = (i/10)	% 10;
			 //subString이 뭐지...
			 if((h==t)&&(i%5==0)){
				// count++;
					 System.out.println("백의자리 =" + h +", 십의자리" + t);
			//if(count%10==0) {
				System.out.println();
			}
		}
	}
	}
//}
