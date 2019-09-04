
public class PohamMain {

	public static void main(String[] args) {
		PohamCar lee =new PohamCar("이승엽","black");
		lee.turnHandle(120);
		System.out.println(lee.ownerName+"의 차량 색깔은"+lee.carColor+"이고"+lee.handle.quantity+"속도로 "+lee.turnShow+"중입니다.");
	}
}
