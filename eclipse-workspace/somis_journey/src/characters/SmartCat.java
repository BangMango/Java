package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.SensitiveGlasses;

public class SmartCat extends KoreanShort implements WeaponBehavior, AttackBehavior{
	
	private final String name = "�ȳ���";
	
	SensitiveGlasses sensitiveGlasses;
	
	// �ȳ��� ������ ��ų��
	public void seeDeeply() {
		System.out.println(name + " : " +"�����ϱ�!");
	}

	public void research() {
		System.out.println(name + " : " +"�����ϱ�!");
	}

	public void powerConcentrate() {
		System.out.println(name + " : " +"�����ϱ�!");
	}

	@Override
	public void invokeMainSkill() {
		this.research();
	}

	@Override
	public void invokePartSkill() {
		this.powerConcentrate();
	}

	@Override
	public <T> void setWeapon(T weapon) {
		sensitiveGlasses = (SensitiveGlasses) weapon;
	}

	@Override
	public void invokeWeaponSkill() {
		if(sensitiveGlasses == null) {
			System.out.println("���� ���� ���� ���⸦ ����� �� �����ϴ�.");	
		} else {
			System.out.println(sensitiveGlasses.getSkillName());
		}
	}
}