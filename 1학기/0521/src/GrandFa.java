
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
	public String gabo = "삼강청자";
	protected String gahun = "모든일에 최선을";

	public GrandFa() {
		System.out.println("할아버지 생성자");
	}
	
	public GrandFa(int nai) {
		this();
		this.nai=nai;
	}
	
	public String say() {
		return "할어버지 말씀: 어릴수록 즐겨라 ~~";
	}
	public String est() {
		return "맛있게 밥을 먹자";
	}
}


