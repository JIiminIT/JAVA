
public class numberQ {

	public static void main(String[] args) {
		//sot - so =tt
	   //- so/////
		
		for(int s=0; s<=9; s++) {
			for(int o =0; o<=9; o++) {
				for(int t =0; t<=9; t++) {
					if((s*100 +o*10 + t) - (s*10 + o) == (t*10 +t)) {
						System.out.println(s+""+o+""+t);
					}
				}
			}
		}
		
		
		

	}

}
