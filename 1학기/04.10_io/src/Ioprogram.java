import java.io.IOException;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
public class Ioprogram {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inputString = scanner.nextline();
//		System.out.println(inputString);
//		System.err.println(inputString);//붉은색으로 출력이 된다.
//		
		int bt;
		try {
			while((bt=System.in.read()) != -1) {
			System.out.println((char)bt);//char 로 출력하라는 뜻
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
