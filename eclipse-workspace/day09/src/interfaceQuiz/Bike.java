package interfaceQuiz;

public class Bike implements BikeSkills{

	@Override
	public void conrtolHandle(String leftOrRight) {
		// TODO Auto-generated method stub
		if(leftOrRight.equals("left")) {
			System.out.println("핸들 방향이 왼쪽으로 변경되었습니다.");
		}else {
			System.out.println("핸들 방향이 오른쪽으로 변경되었습니다.");
		}
	}

	@Override
	public void stepPedal() {
		System.out.println("삐걱삐걱");
	}

}
