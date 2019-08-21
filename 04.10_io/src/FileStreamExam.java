import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExam {

	public static void main(String[] args) {
		byte[] b = new byte[1024];
		
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream("src/tin.txt");
			fos = new FileOutputStream("src/tout.txt");
			
			fis.read(b); //IOException
			fos.write(b);//IOException
			fis.close(); //IOException
			fos.close(); //IOException
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
 