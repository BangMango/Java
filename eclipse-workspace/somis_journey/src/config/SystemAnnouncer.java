package config;
public class SystemAnnouncer {

	public void printStartRound(Integer round) {
		System.out.println("");
		System.out.println(round + "ȸ�� �����մϴ�!");
		System.out.println("");
	}
	
	public void printCharacterStatus(String charName, Integer charHp, Integer charMp) {
		System.out.println("");
		System.out.println(charName + " HP: " + charHp);
		System.out.println(charName + " MP: " + charMp);
		System.out.println("");
	}
	
	public void refreshRound(Integer round) {
		System.out.println("");
		System.out.println(round + "ȸ���� ����Ǿ����ϴ�!");
		System.out.println("");
	}
}