package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.YoungGuns;

public class Duchi extends Sigorjabjong implements WeaponBehavior, AttackBehavior{
	
	private final String name = "��ġ";
	
	YoungGuns youngGuns;
	
	// ��ġ ������ ��ų��
	public void bornAttack() {
		System.out.println(name + " : " +"���ٱ� ����!");
	}

	public void bodyShot() {
		System.out.println(name + " : " +"���� ��ġ��!");
	}

	public void dogPunch() {
		System.out.println(name + " : " +"�۸���ġ!");
	}

	public void dogBackKick() {
		System.out.println(name + " : " +"�۸� �ڵ�������!");
	}

	@Override
	public void invokeMainSkill() {
		this.bornAttack();
	}

	@Override
	public void invokePartSkill() {
		this.bodyShot();
	}

	@Override
	public <T> void setWeapon(T weapon) {
		youngGuns = (YoungGuns) weapon;
	}

	@Override
	public void invokeWeaponSkill() {
		if(youngGuns == null) {
			System.out.println("���� ���� ���� ���⸦ ����� �� �����ϴ�.");
		} else {
			System.out.print(youngGuns.getSkillName());	
		}
	}
}