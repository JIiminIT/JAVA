
public class GrandFa {
	
	public int getNai() {
		return nai;
	}

	public void setNai(int nai) {
		this.nai = nai;
	}

	public String getGabo() {
		return gabo;
	}

	public void setAgbo(String gabo) {
		this.gabo = gabo;
	}

	public String getGahun() {
		return gahun;
	}

	public void setGahun(String gahun) {
		this.gahun = gahun;
	}
	private int nai = 80;
	public String gabo = "�ﰭû��";
	protected String gahun = "����Ͽ� �ּ���";

	public GrandFa() {
		System.out.println("�Ҿƹ��� ������");
	}
	
	public GrandFa(int nai) {
		this();
		this.nai=nai;
	}
	
	public String say() {
		return "�Ҿ���� ����: ����� ��ܶ� ~~";
	}
	public String est() {
		return "���ְ� ���� ����";
	}
}


