
public class TT {

		String name;//�̸�
		String address;//�ּ�
		double math;//����
		double english;//����
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getMath() {
			return math;
		}

		public void setMath(double math) {
			this.math = math;
		}

		public double getEnglish() {
			return english;
		}

		public void setEnglish(double english) {
			this.english = english;
		}

		public double getTotal() {
			return math + english; //getTotal()
		}
		
		public double getAverage() {
			return getTotal()/2.0;//getAddress()
		}

		@Override
		public String toString() {
			String getTotal;
			// TODO Auto-generated method stub
			return "TT [name=" + name + "engilsh" + english + "Math"+ math + "address" 
			+ address  + getTotal() + getAverage()+"]";
		}
		
		
	}


