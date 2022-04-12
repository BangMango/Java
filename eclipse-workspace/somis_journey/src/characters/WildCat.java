package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.PowerGlove;

public class WildCat extends KoreanShort implements WeaponBehavior, AttackBehavior{
	
	private final String name = "�ɾ�ġ";
	
	PowerGlove powerGlove;
	
	// �ɾ�ġ ������ ��ų��
	public void powerFingerNail() {
		System.out.println(name + " : " +"�ʰ��� ����!");
	}

	public void powerFootNail() {
		System.out.println(name + " : " +"�ʰ��� ����!");
	}

	public void yarn() {
		System.out.println(name + " : " +"�Ͼ�~!");
	}

	@Override
	public void invokeMainSkill() {
		this.powerFingerNail();
	}

	@Override
	public void invokePartSkill() {
		this.yarn();
	}

	@Override
	public <T> void setWeapon(T weapon) {
		powerGlove = (PowerGlove) weapon;
	}

	@Override
	public void invokeWeaponSkill() {
		if(powerGlove == null) {
			System.out.println("���� ���� ���� ���⸦ ����� �� �����ϴ�.");	
		} else {
			System.out.println(powerGlove.getSkillName());
		}
	}
}