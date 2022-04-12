package interfaceExample;

public class Cat implements SetItems{

	@Override
	public void setMainWeapon() {
		// TODO Auto-generated method stub
		System.out.println("고양이 주무기 장착 완료");
	}

	@Override
	public void setPartWeapon() {
		// TODO Auto-generated method stub
		System.out.println("고양이 보조무기 장착 완료");
	}

}
