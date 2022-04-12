package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.LightSchoolBag;

public class YoungCat extends KoreanShort implements WeaponBehavior, AttackBehavior{

	private final String name = "켓초딩";
	
	LightSchoolBag lightSchoolBag;
	
	// 켓초딩 고유의 스킬들
	public void cry() {
		System.out.println(name + " : " +"으아아아앙~");
	}

	@Override
	public void invokeMainSkill() {
		this.cry();
	}

	@Override
	public void invokePartSkill() {
		System.out.println("보조 스킬이 없습니다");
	}

	@Override
	public <T> void setWeapon(T weapon) {
		lightSchoolBag = (LightSchoolBag) weapon;
	}

	@Override
	public void invokeWeaponSkill() {
		if(lightSchoolBag == null) {
			System.out.println("무기 장착 없이 무기를 사용할 수 없습니다.");	
		} else {
			System.out.println(lightSchoolBag.getSkillName());
		}
	}
}