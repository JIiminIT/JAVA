
public class PohamCar { 
	String ownerName, carName, turnShow, carColor;
	PohamHandle handle;
	public PohamCar() {
		
	}
	public PohamCar(String ownerName, String carColor ) {
		this.ownerName= ownerName;
		this.carColor=carColor;
		handle = new PohamHandle();
	}
	
	public void turnHandle(int q) {
		turnShow = handle.speedUp(q); 
	} 
	}

	
