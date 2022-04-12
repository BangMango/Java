package weapoms;

public class CasinoChips extends Weapon{

	private String color;
	private String chipType; // GOLD, SILVER, BRONZE
	
	private final String OWNER_NAME = "�ɾ���";

	private final String SKILL_NAME = "���� �ʱ�ȭ!";
	
	public CasinoChips() {
		this("RED", "BRONZE");
	}
	
	public CasinoChips(String color) {
		this.color = color;
		this.chipType = "BRONZE";
	}
	
	public CasinoChips(String color, String chipType) {
		this.color = color;
		this.chipType = chipType;
	}

	@Override
  public String getSkillName() {
      return OWNER_NAME + " : " + SKILL_NAME;
  }
}