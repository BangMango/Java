package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.CasinoChips;

public class GamblingCat extends KoreanShort implements WeaponBehavior, AttackBehavior{
	
	private final String name = "냥쓸이";
	
	CasinoChips casinoChips;
	
	// 냥쓸이 고유의 스킬들
	public void toGamble() {
		System.out.println(name + " : " +"베팅하기!");
	}

	public void allIn() {
		System.out.println(name + " : " +"올인!");
	}

	public void fakeHand() {
		System.out.println(name + " : " +"밑장빼기!");
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
			System.out.println("무기 장착 없이 무기를 사용할 수 없습니다.");		
		} else {
			System.out.println(casinoChips.getSkillName());
		}
	}
}