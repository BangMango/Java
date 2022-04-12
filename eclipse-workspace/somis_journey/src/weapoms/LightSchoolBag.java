package weapoms;

public class LightSchoolBag extends Weapon{

	private String color;
	private String bagType; // NONE_MAKER, MAKER
	
	private final String OWNER_NAME = "���ʵ�";

	private final String SKILL_NAME = "���� ������!";
	
	public LightSchoolBag() {
		this("BLUE", "MAKER");
	}
	
	public LightSchoolBag(String color) {
		this.color = color;
		this.bagType = "NONE_MAKER";
	}
	
	public LightSchoolBag(String color, String bagType) {
		this.color = color;
		this.bagType = bagType;
	}

	@Override
  public String getSkillName() {
      return OWNER_NAME + " : " + SKILL_NAME;
  }
}