package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.SensitiveGlasses;

public class SmartCat extends KoreanShort implements WeaponBehavior, AttackBehavior{
	
	private final String name = "똑냥이";
	
	SensitiveGlasses sensitiveGlasses;
	
	// 똑냥이 고유의 스킬들
	public void seeDeeply() {
		System.out.println(name + " : " +"간파하기!");
	}

	public void research() {
		System.out.println(name + " : " +"연구하기!");
	}

	public void powerConcentrate() {
		System.out.println(name + " : " +"집중하기!");
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
			System.out.println("무기 장착 없이 무기를 사용할 수 없습니다.");	
		} else {
			System.out.println(sensitiveGlasses.getSkillName());
		}
	}
}