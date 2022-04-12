package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.LightSchoolBag;

public class YoungCat extends KoreanShort implements WeaponBehavior, AttackBehavior{

	private final String name = "���ʵ�";
	
	LightSchoolBag lightSchoolBag;
	
	// ���ʵ� ������ ��ų��
	public void cry() {
		System.out.println(name + " : " +"���ƾƾƾ�~");
	}

	@Override
	public void invokeMainSkill() {
		this.cry();
	}

	@Override
	public void invokePartSkill() {
		System.out.println("���� ��ų�� �����ϴ�");
	}

	@Override
	public <T> void setWeapon(T weapon) {
		lightSchoolBag = (LightSchoolBag) weapon;
	}

	@Override
	public void invokeWeaponSkill() {
		if(lightSchoolBag == null) {
			System.out.println("���� ���� ���� ���⸦ ����� �� �����ϴ�.");	
		} else {
			System.out.println(lightSchoolBag.getSkillName());
		}
	}
}