import java.io.IOException;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
public class Ioprogram {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inputString = scanner.nextline();
//		System.out.println(inputString);
//		System.err.println(inputString);//���������� ����� �ȴ�.
//		
		int bt;
		try {
			while((bt=System.in.read()) != -1) {
			System.out.println((char)bt);//char �� ����϶�� ��
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
