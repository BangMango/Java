package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.PowerBazuka;

public class Bbuggu extends Jindo implements WeaponBehavior, AttackBehavior{
	
	private final String name = "�Ѳ�";
	
	PowerBazuka powerBazuka;
	
	// �Ѳ� ������ ��ų��
	public void bornAttack() {
		System.out.println(name + " : " +"���ٱ� ����!");
	}

	public void bodyShot() {
		System.out.println(name + " : " +"���� ��ġ��!");
	}

	public void dogUpperCut() {
		System.out.println(name + " : " +"�۸� ������!");
	}

	public void dogSideKick() {
		System.out.println(name + " : " +"�۸� ������!");
	}

	@Override
	public void invokeMainSkill() {
		this.dogUpperCut();
	}

	@Override
	public void invokePartSkill() {
		this.dogSideKick();
	}

	@Override
	public <T> void setWeapon(T weapon) {
		powerBazuka = (PowerBazuka) weapon;
	}

	@Override
	public void invokeWeaponSkill() {
		if(powerBazuka == null) {
			System.out.println("���� ���� ���� ���⸦ ����� �� �����ϴ�.");
		} else {
			System.out.print(powerBazuka.getSkillName());	
		}
	}
}