import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Su {
	static ArrayList<TT> TTs = new ArrayList<>();

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);			//버퍼 연결하자
			String line;
			while((line = br.readLine()) != null) { //반복, 한줄 읽자
				StringTokenizer st = new StringTokenizer(line, "\t"); //이름\t주소\t수학\t영어
				TT newTT = new TT();//새객체 만들어서 넣자
				newTT.setName(st.nextToken());
				newTT.setAddress(st.nextToken());
				newTT.setMath(Double.parseDouble(st.nextToken()));
				newTT.setEnglish(Double.parseDouble(st.nextToken()));
				//객체 만들어서 넣자
				TTs.add(newTT);	//리스트에 만들어진 새객체 넣자
			}
			for(TT a : TTs) { //리스트 출력하기
				System.out.println(a);
			}
			
			//파일로 저장하자
			FileWriter fw = new FileWriter("src/save.txt"); //파일 연결하자
			BufferedWriter bw = new BufferedWriter(fw);	//버퍼 연결하자
			//쓰자
			for(TT a: TTs) {
				bw.write(a.getName() + "\t" + a.getAddress()+"\t");
				bw.write(a.getMath() + "\t" + a.getEnglish()+"\t");
				bw.write(a.getTotal() + "\t" + a.getAverage());
				bw.newLine();
			}
			//닫자
			fr.close();
			fw.close();
			br.close();
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}