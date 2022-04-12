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
	//�ý��� �ȳ���
	private static SystemAnnouncer systemAnnouncer;
	//������ ����
	private static Somi somi;
	private static SmartCat smartCat;
	private static WildCat wildCat;
	private static GamblingCat gamblingCat;
	private static YoungCat youngCat;
	private static HealingCat healingCat;
	//������ ����
	private static Duchi duchi;
	private static Bbuggu bbuggu;
	//��ų�Ŀ� ��������
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
		// ��ġ ���� ���� setting
		YoungGuns youngGuns = new YoungGuns();
		duchi = new Duchi();
		duchi.setWeapon(youngGuns);
		
		// �Ѳ� ���� ���� setting
		PowerBazuka powerBazuka = new PowerBazuka();
		bbuggu = new Bbuggu();
		bbuggu.setWeapon(powerBazuka);
	}
	
	public static void round1() {
		systemAnnouncer.printStartRound(1);
        System.out.println("");
        System.out.println("��ġ: �̳����� ��ٷȴ�. �̹����߸��� ������ ����");
        System.out.println("�Ѳ�: �̹����߸��� ����Ͻʽÿ�....");

        System.out.println("�ҹ�: �ʳ� ��¥ ����� �ֵ��̱���. �׷��� ������ �� �����");
        System.out.println("�ȳ���: ������ ��ġ�� �Ѳٰ� �ƴϾ�");

        System.out.println("�ҹ�: ?!");

        System.out.println("�ɾ���: �̹��� ���� ����� ����.....");
        
        //�ɾ��� ����
        System.out.println();
        System.out.println("-1�� ����-");
        gamblingCat.invokeMainSkill();
        gamblingCat.setMp(gamblingCat.getMp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("�ɾ���", gamblingCat.getHp(), gamblingCat.getMp());
        duchi.setHp(duchi.getHp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
        System.out.println("-1�� ����-");
        System.out.println();
        //��ġ ����
        System.out.println("");
        System.out.println("-2�� ����-");
        duchi.invokeMainSkill();
        duchi.setMp(duchi.getMp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
        gamblingCat.setHp(gamblingCat.getHp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("�ɾ���", gamblingCat.getHp(), gamblingCat.getMp());
        System.out.println("-2�� ����-");
        System.out.println();
        //�ɾ��� ����
        System.out.println("");
        System.out.println("-3�� ����-");
        gamblingCat.invokePartSkill();
        gamblingCat.setMp(gamblingCat.getMp()-partSkillPower);
        systemAnnouncer.printCharacterStatus("�ɾ���", gamblingCat.getHp(), gamblingCat.getMp());
        duchi.setHp(duchi.getHp()-partSkillPower);
        systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
        System.out.println("-3�� ����-");
        System.out.println();
        //��ġ ����
        System.out.println("");
        System.out.println("-4�� ����-");
        duchi.invokePartSkill();
        duchi.setMp(duchi.getMp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
        gamblingCat.setHp(gamblingCat.getHp()-mainSkillPower);
        systemAnnouncer.printCharacterStatus("�ɾ���", gamblingCat.getHp(), gamblingCat.getMp());
        //���� ����
        systemAnnouncer.refreshRound(1);
	}
	public static void round2() {
		systemAnnouncer.printStartRound(2);
		System.out.println();
		System.out.println("��ġ : �ʳ׵��� Ʈ������ �͵�... ���� ���� �� ������");
		System.out.println("�ɾ�ġ: ���� �߰ſ� �ָԸ��� ���߰ڱ���...");
		System.out.println();
		System.out.println("-1�� ����-");
		wildCat.invokeMainSkill();
		wildCat.setMp(wildCat.getMp()-partSkillPower);
		systemAnnouncer.printCharacterStatus("�ɾ�ġ", wildCat.getHp(), wildCat.getMp());
		duchi.setHp(duchi.getHp()-partSkillPower);
		systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
		System.out.println("-1�� ����-");
		System.out.println();
		System.out.println("-2�� ����-");
		duchi.invokeMainSkill();
		duchi.setMp(duchi.getMp()-mainSkillPower);
		systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
		wildCat.setHp(wildCat.getHp()-mainSkillPower);
		systemAnnouncer.printCharacterStatus("�ɾ�ġ", wildCat.getHp(), wildCat.getMp());
		System.out.println("-2�� ����-");
		System.out.println();
		System.out.println("-3�� ����-");
		wildCat.invokePartSkill();
		wildCat.setMp(wildCat.getMp()-partSkillPower);
		systemAnnouncer.printCharacterStatus("�ɾ�ġ", wildCat.getHp(), wildCat.getMp());
		duchi.setHp(duchi.getHp()-partSkillPower);
		systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
		System.out.println("-3�� ����-");
		System.out.println();
		System.out.println("-4�� ����-");
		duchi.invokeMainSkill();
		duchi.setMp(duchi.getMp()-mainSkillPower);
		systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
		wildCat.setHp(wildCat.getHp()-mainSkillPower);
		systemAnnouncer.printCharacterStatus("�ɾ�ġ", wildCat.getHp(), wildCat.getMp());
		System.out.println("-4�� ����-");
		systemAnnouncer.refreshRound(2);
	}
	public static void round3() {
	

        systemAnnouncer.printStartRound(3);

        System.out.println("");
        System.out.println("���ʵ�: �����ڽ�..�뼭 ���Ѵٿ�");
        System.out.println("��ġ: ����� �ο��� ����� ����������!");

        // 1. ���ʵ� ����
        System.out.println("");
        System.out.println("- 1�� ����-");
        youngCat.invokeWeaponSkill();
        youngCat.setMp(youngCat.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("���ʵ�", youngCat.getHp(), youngCat.getMp());
        //
        duchi.setHp(duchi.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
        System.out.println("- 1�� ����-");
        System.out.println("");
        //

        // 2. ���ʵ� ����
        System.out.println("");
        System.out.println("- 2�� ����-");
        youngCat.invokeWeaponSkill();
        youngCat.setMp(youngCat.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("���ʵ�", youngCat.getHp(), youngCat.getMp());
        //
        duchi.setHp(duchi.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("��ġ", duchi.getHp(), duchi.getMp());
        System.out.println("- 2�� ����-");
        System.out.println("");
        //

        // 3. ���� ����
        systemAnnouncer.refreshRound(3);
    }
	public static void round4() {
		systemAnnouncer.printStartRound(4);
		System.out.println("���ʵ�: �� �⼼�� ���Ƽ� �ʵ� ���� �����߷��ָ�");
		System.out.println("�Ѳ�: ......");
		System.out.println("-1�� ����-");
		youngCat.invokeWeaponSkill();
		youngCat.setMp(youngCat.getMp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("���ʵ�", youngCat.getHp(), youngCat.getMp());
		bbuggu.setHp(bbuggu.getHp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("�Ѳ�", bbuggu.getHp(), bbuggu.getMp());
		System.out.println("-1�� ����-");
		System.out.println();
		System.out.println("-2�� ����-");
		bbuggu.invokeWeaponSkill();
		bbuggu.setMp(bbuggu.getMp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("�Ѳ�", bbuggu.getHp(), bbuggu.getMp());
		youngCat.setHp(youngCat.getHp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("���ʵ�", youngCat.getHp(), youngCat.getMp());
		System.out.println("-2�� ����-");
		System.out.println();
		System.out.println("-3�� ����-");
		bbuggu.invokeWeaponSkill();
		bbuggu.setMp(bbuggu.getMp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("�Ѳ�", bbuggu.getHp(), bbuggu.getMp());
		youngCat.setHp(youngCat.getHp()-weaponSkillPower);
		systemAnnouncer.printCharacterStatus("���ʵ�", youngCat.getHp(), youngCat.getMp());
		System.out.println("-3�� ����-");
		System.out.println();
		systemAnnouncer.refreshRound(4);
	}
	public static void round5() {

        systemAnnouncer.printStartRound(5);

        System.out.println("");
        System.out.println("�ҹ�: ����� ������ ���ָ�");
        System.out.println("�Ѳ�: �Ͷ�");
        System.out.println("");

        // 1. �ҹ� ����
        System.out.println("");
        System.out.println("- 1�� ����-");
        somi.invokeWeaponSkill();
        somi.setMp(somi.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("�ҹ�", somi.getHp(), somi.getMp());
        //
        bbuggu.setHp(bbuggu.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("�Ѳ�", bbuggu.getHp(), bbuggu.getMp());
        System.out.println("- 1�� ����-");
        System.out.println("");
        //

        // 2. �Ѳ� ����
        System.out.println("");
        System.out.println("- 2�� ����-");
        bbuggu.invokeWeaponSkill();
        bbuggu.setMp(bbuggu.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("�Ѳ�", bbuggu.getHp(), bbuggu.getMp());
        //
        somi.setHp(youngCat.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("�ҹ�", somi.getHp(), somi.getMp());
        System.out.println("- 2�� ����-");
        System.out.println("");
        //

        // 3. �ҹ� ����
        System.out.println("");
        System.out.println("- 3�� ����-");
        somi.invokeWeaponSkill();
        somi.setMp(somi.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("�ҹ�", somi.getHp(), somi.getMp());
        //
        bbuggu.setHp(bbuggu.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("�Ѳ�", bbuggu.getHp(), bbuggu.getMp());
        System.out.println("- 3�� ����-");
        System.out.println("");
        //

        // 4. �Ѳ�
        System.out.println("");
        System.out.println("- 4�� ����-");
        bbuggu.invokeWeaponSkill();
        bbuggu.setMp(bbuggu.getMp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("�Ѳ�", bbuggu.getHp(), bbuggu.getMp());
        //
        somi.setHp(youngCat.getHp() - weaponSkillPower);
        systemAnnouncer.printCharacterStatus("�ҹ�", somi.getHp(), somi.getMp());
        System.out.println("- 4�� ����-");
        System.out.println("");

        // 5. ���� ����
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