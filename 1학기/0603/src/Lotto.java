
public class Lotto {
	public static void main (String ars[]) {
		
		int Lotto[] = new int[7];
		int human[] = new int[6];
		int count = 10000;
		int lucky;
		int lucky_b;
		int rank1 = 0, rank2 = 0, rank3 = 0, rank4 = 0, rank5 = 0, rank6 = 0;
		
		for(int i = 0; i < 7; i++) {
			Lotto[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (Lotto[j] == Lotto[i]) {
					i --;
					break;
				}
			}
		}
		
		for (int k = 1; k < count; k++) {
			System.out.printf("[�� %5d ȸ] ", k);
			
			for (int i = 0; i < 6; i++) {
				System.out.printf("%2d ", Lotto[i]);
			}
			
			System.out.printf("[%2d] \t", Lotto[6]);
			
			for(int i = 0; i < 6; i++) {
				human[i] = (int)(Math.random() * 45) + 1;
				for (int j = 0; j < i; j ++) {
					if (human[j] == human[i]) {
						i --;
						break;
				}
			}
		}
		
			lucky = 0;
			
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (human[i] == Lotto[j]) {
						System.out.printf("%2d ", human[i]);
						lucky++;
						break;
					} else if (human[i] != Lotto[j] && j == 5) {
						System.out.printf("%2d ", human[i]);
					}
				}
			}
				int i1;
				
				for (i1 = 0, lucky_b = 0; i1 < 6; i1++) {
					if(Lotto[6] == human[i1]) {
						lucky_b = 1;
						break;
					}
				}
				
				switch (lucky) {
				case 6: 
					System.out.println("* �����մϴ�. 1 � ��÷�Ǽ̽��ϴ�. *");
					rank1++;
					break;
				case 5: 
					if(lucky_b == 1) {
						System.out.println("[ 2�� ]");
						rank2++;
					} else {
						System.out.println("[ 3�� ]");
						rank3++;
					} break;
				case 4:
					System.out.println("[ 4�� ]");
					rank4++;
					break;
				case 3:
					System.out.println("[ 5�� ]");
					rank5++;
					break;
				default:
					System.out.println("* ��  *");
					rank6++;  
					break;
				}
		}
				System.out.println();
				System.out.println("[�� ���� Ƚ��] : " + count + "ȸ\n");
				System.out.println("1�� : " + rank1 + "ȸ");
				System.out.println("2�� : " + rank2 + "ȸ");
				System.out.println("3�� : " + rank3 + "ȸ");
				System.out.println("4�� : " + rank4 + "ȸ");
				System.out.println("5�� : " + rank5 + "ȸ");
				System.out.println("6�� : " + rank6 + "ȸ");
		
		}
}
