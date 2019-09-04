
public class PhysicalInfoMain {
	
	public static void main(String[] args) {
		PhysicalInfo obj;
		obj = new PhysicalInfo("해리",10,132.0f,35.0f);
	//	printPhysicalInfo(obj);
		
		obj.update(11,145.0f, 45.0f);
		//printPhysicalInfo(obj);
		
		obj.update(12,145.0f, 45.0f);
	//	printPhysicalInfo(obj);
	}
		
	static void printPhysicalInfo(PhysicalInfo obj){//printPhysicalInfo
		System.out.println("이름" + obj.name);
		System.out.println("나이" + obj.age);
		System.out.println("키" + obj.height);
		System.out.println("몸무게" + obj.weight);
		System.out.println();

	}
	}
		

	


