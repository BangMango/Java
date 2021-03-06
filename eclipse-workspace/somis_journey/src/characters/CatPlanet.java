package characters;

import config.SystemAnnouncer;
import weapoms.CasinoChips;
import weapoms.LightSchoolBag;
import weapoms.MagicFoundation;
import weapoms.PowerBazuka;
import weapoms.PowerGlove;
import weapoms.SensitiveGlasses;
import weapoms.YoungGuns;

public class CatPlanet {
	//시스템 안내자
	private static SystemAnnouncer systemAnnouncer;
	//고양이 변수
	private static Somi somi;
	private static SmartCat smartCat;
	private static WildCat wildCat;
	private static GamblingCat gamblingCat;
	private static YoungCat youngCat;
	private static HealingCat healingCat;
	//강아지 변수
	private static Duchi duchi;
	private static Bbuggu bbuggu;
	//스킬파워 가져오기
	private static Integer mainSkillPower= Character.MAIN_SKILL_ATTACK_POWER;
	private static Integer partSkillPower = Character.PART_SKILL_ATTACK_POWER;	
	private static Integer weaponSkillPower= Character.WEAPON_SKILL_ATTACK_POWER;
	private static void setCatsWeapon() {
		MagicFoundation magicFoundation =new MagicFoundation("PINK","WHITE");
		somi.setWeapon(magicFoundation);
		SensitiveGlasses sensitiveGlasses=new SensitiveGlasses("SILVER","CIRCLE");
		smartCat.setWeapon(sensitiveGlasses);
		PowerGlove powerGlove=new PowerGlove("BLACK","FIRE");
		wildCat.setWeapon(powerGlove);
		CasinoChips casinoChips=new CasinoChips("RED","SILVER");
		gamblingCat.setWeapon(casinoChips);
		LightSchoolBag lightSchoolBag=new LightSchoolBag();
		youngCat.setWeapon(lightSchoolBag);
		
	}
	
	private static void setDogsWeapon() {
		// 두치 전용 무기 setting
		YoungGuns youngGuns = new YoungGuns();
		duchi = new Duchi();
		duchi.setWeapon(youngGuns);
		
		// 뿌꾸 전용 무기 setting
		PowerBazuka powerBazuka = new PowerBazuka();
		bbuggu = new Bbuggu();
		bbuggu.setWeapon(powerBazuka);
	}
	
	public static void round1() {
		systemAnnouncer.printStartRound(1);
        System.out.println("");
        System.out.println("두치: 이날만을 기다렸다. 이번에야말로 끝장을 보자");
        System.out.println("뿌꾸: 이번에야말로 기대하십시오....");

        System.out.println("소미: 너네 진짜 웃기는 애들이구나. 그렇게 지고도 또 덤비냥");
        System.out.println("똑냥이: 이전의 두치와 뿌꾸가 아니야");

        System.out.println("소미: ?!");

        System.out.println("냥쓸이: 이번엔 내가 상대해 주지.....");
        
        //냥쓸이 공격
        System.out.println();
        System.out.println("-1턴 시작-");
        gamblingCat.invokeMainSkill();
        gamblingCat.setMp(gamblingCat.getMp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("냥쓸이", gamblingCat.getHp(), gamblingCat.getMp());
        duchi.setHp(duchi.getHp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
        System.out.println("-1턴 종료-");
        System.out.println();
        //두치 공격
        System.out.println("");
        System.out.println("-2턴 시작-");
        duchi.invokeMainSkill();
        duchi.setMp(duchi.getMp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
        gamblingCat.setHp(gamblingCat.getHp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("냥쓸이", gamblingCat.getHp(), gamblingCat.getMp());
        System.out.println("-2턴 종료-");
        System.out.println();
        //냥쓸이 공격
        System.out.println("");
        System.out.println("-3턴 시작-");
        gamblingCat.invokePartSkill();
        gamblingCat.setMp(gamblingCat.getMp()-partSkillPower);
        systemAnnouncer.printCharacterStatus("냥쓸이", gamblingCat.getHp(), gamblingCat.getMp());
        duchi.setHp(duchi.getHp()-partSkillPower);
        systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
        System.out.println("-3턴 종료-");
        System.out.println();
        //두치 공격
        System.out.println("");
        System.out.println("-4턴 시작-");
        duchi.invokePartSkill();
        duchi.setMp(duchi.getMp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
        gamblingCat.setHp(gamblingCat.getHp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("냥쓸이", gamblingCat.getHp(), gamblingCat.getMp());
        //라운드 종료
        systemAnnouncer.refreshRound(1);
	}
	public static void round2() {
		systemAnnouncer.printStartRound(2);
		System.out.println();
		System.out.println("두치 : 너네들이 트럭으로 와도... 나를 꺾을 순 없을걸");
		System.out.println("냥아치: 나의 뜨거운 주먹맛을 봐야겠구먼...");
		System.out.println();
		System.out.println("-1턴 시작-");
		wildCat.invokeMainSkill();
		wildCat.setMp(wildCat.getMp()-partSkillPower);
		systemAnnouncer.printCharacterStatus("냥아치", wildCat.getHp(), wildCat.getMp());
		duchi.setHp(duchi.getHp()-partSkillPower);
		systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
		System.out.println("-1턴 종료-");
		System.out.println();
		System.out.println("-2턴 시작-");
		duchi.invokeMainSkill();
		duchi.setMp(duchi.getMp()-mainSkillPower);
		systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
		wildCat.setHp(wildCat.getHp()-mainSkillPower);
		systemAnnouncer.printCharacterStatus("냥아치", wildCat.getHp(), wildCat.getMp());
		System.out.println("-2턴 종료-");
		System.out.println();
		System.out.println("-3턴 시작-");
		wildCat.invokePartSkill();
		wildCat.setMp(wildCat.getMp()-partSkillPower);
		systemAnnouncer.printCharacterStatus("냥아치", wildCat.getHp(), wildCat.getMp());
		duchi.setHp(duchi.getHp()-partSkillPower);
		systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
		System.out.println("-3턴 종료-");
		System.out.println();
		System.out.println("-4턴 시작-");
		duchi.invokeMainSkill();
		duchi.setMp(duchi.getMp()-mainSkillPower);
		systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
		wildCat.setHp(wildCat.getHp()-mainSkillPower);
		systemAnnouncer.printCharacterStatus("냥아치", wildCat.getHp(), wildCat.getMp());
		System.out.println("-4턴 종료-");
		systemAnnouncer.refreshRound(2);
	}
	public static void round3() {
	

        systemAnnouncer.printStartRound(3);

        System.out.println("");
        System.out.println("켓초딩: 나쁜자식..용서 못한다옹");
        System.out.println("두치: 몇번을 싸워도 결과는 마찬가지야!");

        // 1. 켓초딩 공격
        System.out.println("");
        System.out.println("- 1턴 시작-");
        youngCat.invokeWeaponSkill();
        youngCat.setMp(youngCat.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("켓초딩", youngCat.getHp(), youngCat.getMp());
        //
        duchi.setHp(duchi.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
        System.out.println("- 1턴 종료-");
        System.out.println("");
        //

        // 2. 켓초딩 공격
        System.out.println("");
        System.out.println("- 2턴 시작-");
        youngCat.invokeWeaponSkill();
        youngCat.setMp(youngCat.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("켓초딩", youngCat.getHp(), youngCat.getMp());
        //
        duchi.setHp(duchi.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("두치", duchi.getHp(), duchi.getMp());
        System.out.println("- 2턴 종료-");
        System.out.println("");
        //

        // 3. 라운드 종료
        systemAnnouncer.refreshRound(3);
    }
	public static void round4() {
		systemAnnouncer.printStartRound(4);
		System.out.println("켓초딩: 이 기세를 몰아서 너도 내가 쓰려뜨려주마");
		System.out.println("뿌꾸: ......");
		System.out.println("-1턴 시작-");
		youngCat.invokeWeaponSkill();
		youngCat.setMp(youngCat.getMp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("켓초딩", youngCat.getHp(), youngCat.getMp());
		bbuggu.setHp(bbuggu.getHp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("뿌꾸", bbuggu.getHp(), bbuggu.getMp());
		System.out.println("-1턴 종료-");
		System.out.println();
		System.out.println("-2턴 시작-");
		bbuggu.invokeWeaponSkill();
		bbuggu.setMp(bbuggu.getMp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("뿌꾸", bbuggu.getHp(), bbuggu.getMp());
		youngCat.setHp(youngCat.getHp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("켓초딩", youngCat.getHp(), youngCat.getMp());
		System.out.println("-2턴 종료-");
		System.out.println();
		System.out.println("-3턴 시작-");
		bbuggu.invokeWeaponSkill();
		bbuggu.setMp(bbuggu.getMp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("뿌꾸", bbuggu.getHp(), bbuggu.getMp());
		youngCat.setHp(youngCat.getHp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("켓초딩", youngCat.getHp(), youngCat.getMp());
		System.out.println("-3턴 종료-");
		System.out.println();
		systemAnnouncer.refreshRound(4);
	}
	public static void round5() {

        systemAnnouncer.printStartRound(5);

        System.out.println("");
        System.out.println("소미: 모두의 복수를 해주마");
        System.out.println("뿌꾸: 와라");
        System.out.println("");

        // 1. 소미 공격
        System.out.println("");
        System.out.println("- 1턴 시작-");
        somi.invokeWeaponSkill();
        somi.setMp(somi.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("소미", somi.getHp(), somi.getMp());
        //
        bbuggu.setHp(bbuggu.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("뿌꾸", bbuggu.getHp(), bbuggu.getMp());
        System.out.println("- 1턴 종료-");
        System.out.println("");
        //

        // 2. 뿌꾸 공격
        System.out.println("");
        System.out.println("- 2턴 시작-");
        bbuggu.invokeWeaponSkill();
        bbuggu.setMp(bbuggu.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("뿌꾸", bbuggu.getHp(), bbuggu.getMp());
        //
        somi.setHp(youngCat.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("소미", somi.getHp(), somi.getMp());
        System.out.println("- 2턴 종료-");
        System.out.println("");
        //

        // 3. 소미 공격
        System.out.println("");
        System.out.println("- 3턴 시작-");
        somi.invokeWeaponSkill();
        somi.setMp(somi.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("소미", somi.getHp(), somi.getMp());
        //
        bbuggu.setHp(bbuggu.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("뿌꾸", bbuggu.getHp(), bbuggu.getMp());
        System.out.println("- 3턴 종료-");
        System.out.println("");
        //

        // 4. 뿌꾸
        System.out.println("");
        System.out.println("- 4턴 시작-");
        bbuggu.invokeWeaponSkill();
        bbuggu.setMp(bbuggu.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("뿌꾸", bbuggu.getHp(), bbuggu.getMp());
        //
        somi.setHp(youngCat.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("소미", somi.getHp(), somi.getMp());
        System.out.println("- 4턴 종료-");
        System.out.println("");

        // 5. 라운드 종료
        systemAnnouncer.refreshRound(5);
    }
	public static void main(String[] args) {
		systemAnnouncer = new SystemAnnouncer();
		somi=new Somi();
		smartCat=new SmartCat();
		wildCat = new WildCat();
		gamblingCat = new GamblingCat();
		youngCat = new YoungCat();
		healingCat = new HealingCat();
		
		duchi = new Duchi();
		bbuggu = new Bbuggu();
		
		setCatsWeapon();
		setDogsWeapon();
		
		//round1();
		//round2();
		//round3();
		//round4();
		round5();
	}

}
