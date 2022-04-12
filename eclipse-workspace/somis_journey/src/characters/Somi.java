package characters;

import config.AttackBehavior;
import config.WeaponBehavior;
import weapoms.MagicFoundation;

public class Somi extends KoreanShort implements WeaponBehavior, AttackBehavior{
	
	private final String name = "소미";
	
	MagicFoundation magicFoundation;

	// 소미 고유의 스킬들
	public void ask() {
		System.out.println(name + " : " + "부탁한다냥~");
	}

	public void avoid() {
		System.out.println(name + " : " + "36계 줄행량이다냥~!");
	}

	public void punch() {
		System.out.println(name + " : " + "냥냥펀치!");
	}

	public void wrapTail() {
		System.out.println(name + " : " + "꼬리감기!");
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
			System.out.println("무기 장착 없이 무기를 사용할 수 없습니다.");
		} else {
			System.out.print(magicFoundation.getSkillName());	
		}
	}
}