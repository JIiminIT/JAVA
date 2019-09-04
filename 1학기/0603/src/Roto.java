import java.util.Random;
public class Roto {

	public static void main(String[] args) {
		Random roto = new Random();
		
		int[] rotonum = new int[5];
		
		int num = 0;
		for(int i=0; i<=rotonum.length; i++ ) {
	    num= roto.nextInt(45) + 1 ;
	    if(rotonum[1] == rotonum[2] || rotonum[2] == rotonum[3] || rotonum[3] == rotonum[4] || rotonum[4] == rotonum[5]|| rotonum[5]==rotonum[1]) {
	    	num= roto.nextInt(45) + 1 ;
	    }
	    System.out.println(num);
	    
		}
	}

}

/*
#1번
int l1, l2,l3,l4,l5,l6;
l1 = (int)(Math.random() * 45)+1;
do {
 l2= (int)(Math.random() * 45)+1;
}while(l1==l2);
do {
 l3= (int)(Math.random() * 45)+1;
}while(l1==l3);
do {
 l4= (int)(Math.random() * 45)+1;
}while(l1==l4);
do {
 l5= (int)(Math.random() * 45)+1;
}while(l1==l5);
do {
 l6= (int)(Math.random() * 45)+1;
}while(l1==l6);
System.out.println(l1+"/t"+l2+"\t"+l3+"\t"+l4+"\t"+l5+"\t"+l6);
*/


/*2번
 * 
		public class Lotto {
	public static void main(String[] args) {
		
		int count = 1000;
		int[] lotto = new int[7];
		int[] answer = new int[6];
		int lucky; //맞힌 수의 갯수
		int lucky_b; //보너스 숫자를 맞혔는가, 1:맞힘 0:틀림
		int rank1, rank2, rank3, rank4, rank5;
		
		for(int i = 0; i < 7; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				} //if end
			}//for end
		}//for end

		for(int k = 0; k < count; k++) {
			System.out.printf("[제 %5d 회] ", k+1);
			for (int i = 0; i < 6; i++) {
				System.out.printf("%2d ", lotto[i]);
			}
			System.out.printf("[%2d] \t", lotto[6]);
			System.out.println();
		}
		
		for(int i = 0; i < 6; i++) {
			answer[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if(answer[j] == answer[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println();
	}
}
*/
