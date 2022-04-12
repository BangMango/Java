package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.PowerBazuka;

public class Bbuggu extends Jindo implements WeaponBehavior, AttackBehavior{
	
	private final String name = "»Ñ²Ù";
	
	PowerBazuka powerBazuka;
	
	// »Ñ²Ù °íÀ¯ÀÇ ½ºÅ³µé
	public void bornAttack() {
		System.out.println(name + " : " +"»À´Ù±Í °ø°Ý!");
	}

	public void bodyShot() {
		System.out.println(name + " : " +"¸öÅë ¹ÚÄ¡±â!");
	}

	public void dogUpperCut() {
		System.out.println(name + " : " +"¸Û¸Û ¾îÆÛÄÆ!");
	}

	public void dogSideKick() {
		System.out.println(name + " : " +"¸Û¸Û ¿·Â÷±â!");
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
			System.out.println("¹«±â ÀåÂø ¾øÀÌ ¹«±â¸¦ »ç¿ëÇÒ ¼ö ¾ø½À´Ï´Ù.");
		} else {
			System.out.print(powerBazuka.getSkillName());	
		}
	}
}