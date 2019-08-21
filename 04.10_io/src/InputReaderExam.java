import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputReaderExam {

	public static void main(String[] args) {
		Reader reader = new InputStreamReader(System.in);
		while(true) {
		try {
				int i = reader.read();
				if( i == -1) break; //Ctrl + z ´©¸£¸é break
				char c = (char)i;
				System.out.print(c);
			}
		
		 catch(IOException e) {
			e.printStackTrace();
		}
		}
		}
	
	}


