import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

public class ReadFromSysExam {

	public static void main(String[] args) {
		byte[] b =new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b);
		} catch (IOException e) {
			e.printStackTrace();//(System.out.println("�Է½���") - �Լ� ���� ���
		}
		System.out.write(b, 0, len);

	}

}
