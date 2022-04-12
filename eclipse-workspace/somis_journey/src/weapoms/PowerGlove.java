package weapoms;

public class PowerGlove extends Weapon{
	
	private String color;
	private String gloveType; // NONE, FIRE, WATER
	
	private final String OWNER_NAME = "�ɾ�ġ";

	private final String SKILL_NAME = "�Ŀ� ��!";
	
	public PowerGlove() {
		this("RED", "NONE");
	}
	
	public PowerGlove(String color) {
		this.color = color;
		this.gloveType = "NONE";
	}
	
	public PowerGlove(String color, String gloveType) {
		this.color = color;
		this.gloveType = gloveType;
	}

	@Override
  public String getSkillName() {
      return OWNER_NAME + " : " + SKILL_NAME;
  }
}