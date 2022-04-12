package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.CasinoChips;

public class GamblingCat extends KoreanShort implements WeaponBehavior, AttackBehavior{
	
	private final String name = "�ɾ���";
	
	CasinoChips casinoChips;
	
	// �ɾ��� ������ ��ų��
	public void toGamble() {
		System.out.println(name + " : " +"�����ϱ�!");
	}

	public void allIn() {
		System.out.println(name + " : " +"����!");
	}

	public void fakeHand() {
		System.out.println(name + " : " +"���廩��!");
	}

	@Override
	public void invokeMainSkill() {
		this.allIn();
	}

	@Override
	public void invokePartSkill() {
		this.fakeHand();
	}

	@Override
	public <T> void setWeapon(T weapon) {
		casinoChips = (CasinoChips) weapon;
	}

	@Override
	public void invokeWeaponSkill() {
		if(casinoChips == null) {
			System.out.println("���� ���� ���� ���⸦ ����� �� �����ϴ�.");		
		} else {
			System.out.println(casinoChips.getSkillName());
		}
	}
}