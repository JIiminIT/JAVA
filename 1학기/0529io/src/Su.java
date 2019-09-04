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
			BufferedReader br = new BufferedReader(fr);			//���� ��������
			String line;
			while((line = br.readLine()) != null) { //�ݺ�, ���� ����
				StringTokenizer st = new StringTokenizer(line, "\t"); //�̸�\t�ּ�\t����\t����
				TT newTT = new TT();//����ü ���� ����
				newTT.setName(st.nextToken());
				newTT.setAddress(st.nextToken());
				newTT.setMath(Double.parseDouble(st.nextToken()));
				newTT.setEnglish(Double.parseDouble(st.nextToken()));
				//��ü ���� ����
				TTs.add(newTT);	//����Ʈ�� ������� ����ü ����
			}
			for(TT a : TTs) { //����Ʈ ����ϱ�
				System.out.println(a);
			}
			
			//���Ϸ� ��������
			FileWriter fw = new FileWriter("src/save.txt"); //���� ��������
			BufferedWriter bw = new BufferedWriter(fw);	//���� ��������
			//����
			for(TT a: TTs) {
				bw.write(a.getName() + "\t" + a.getAddress()+"\t");
				bw.write(a.getMath() + "\t" + a.getEnglish()+"\t");
				bw.write(a.getTotal() + "\t" + a.getAverage());
				bw.newLine();
			}
			//����
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