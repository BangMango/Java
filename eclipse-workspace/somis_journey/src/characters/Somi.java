package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.MagicFoundation;

public class Somi extends KoreanShort implements WeaponBehavior, AttackBehavior{
	
	private final String name = "�ҹ�";
	
	MagicFoundation magicFoundation;

	// �ҹ� ������ ��ų��
	public void ask() {
		System.out.println(name + " : " + "��Ź�Ѵٳ�~");
	}

	public void avoid() {
		System.out.println(name + " : " + "36�� ���෮�̴ٳ�~!");
	}

	public void punch() {
		System.out.println(name + " : " + "�ɳ���ġ!");
	}

	public void wrapTail() {
		System.out.println(name + " : " + "��������!");
	}

	@Override
	public void invokeMainSkill() {
		this.punch();
	}

	@Override
	public void invokePartSkill() {
		this.wrapTail();
	}

	@Override
	public <T> void setWeapon(T weapon) {
		magicFoundation = (MagicFoundation) weapon;
	}

	@Override
	public void invokeWeaponSkill() {
		if(magicFoundation == null) {
			System.out.println("���� ���� ���� ���⸦ ����� �� �����ϴ�.");
		} else {
			System.out.print(magicFoundation.getSkillName());	
		}
	}
}