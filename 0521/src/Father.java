
public class Father extends GrandFa {

	private int nai = 55;
	private int house = 1;
	public String gabo = "Ȳ�ݵ���";
	
	public Father() {
		System.out.println("");
	}
	
	public Father(int nai) {
		this.nai=nai;
	}

	public int getNai() {
		return nai;
	}

	public void setNai(int nai) {
		this.nai = nai;
	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public String getGabo() {
		return gabo;
	}

	public void setGabo(String gabo) {
		this.gabo = gabo;
	}
	
	public void show() {
		System.out.println(this.gabo);
		System.out.println(super.gahun);
		System.out.println("�ƹ����� ����:"+ this.getNai());
		System.out.println("�Ҿƹ����� ����:" +super.getNai());
		

	}
}
