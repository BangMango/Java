package weapoms;

public class SensitiveGlasses extends Weapon{

	private String color;
	private String glassesType; // CIRCLE, TRIANGLE, SQUARE
	
	private final String OWNER_NAME = "�ȳ���";

	private final String SKILL_NAME = "��վ� ����!";
	
	public SensitiveGlasses() {
		this("BLACK", "CIRCLE");
	}
	
	public SensitiveGlasses(String color) {
		this.color = color;
		this.glassesType = "CIRCLE";
	}
	
	public SensitiveGlasses(String color, String glassesType) {
		this.color = color;
		this.glassesType = glassesType;
	}

	@Override
  public String getSkillName() {
      return OWNER_NAME + " : " + SKILL_NAME;
  }
}