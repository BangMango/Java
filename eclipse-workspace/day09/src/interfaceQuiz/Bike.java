package interfaceQuiz;

public class Bike implements BikeSkills{

	@Override
	public void conrtolHandle(String leftOrRight) {
		// TODO Auto-generated method stub
		if(leftOrRight.equals("left")) {
			System.out.println("�ڵ� ������ �������� ����Ǿ����ϴ�.");
		}else {
			System.out.println("�ڵ� ������ ���������� ����Ǿ����ϴ�.");
		}
	}

	@Override
	public void stepPedal() {
		System.out.println("�߰ƻ߰�");
	}

}
