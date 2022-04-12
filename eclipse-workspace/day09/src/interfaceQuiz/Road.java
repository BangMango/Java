package interfaceQuiz;

public class Road {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.conrtolHandle("left");
		bike.conrtolHandle("right");
		for(int i=0; i<3; i++) {
			bike.stepPedal();
		}
	}

}
