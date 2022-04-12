package weapoms;

public class PowerBazuka extends Weapon{

	private String color;
	private String bombType; // GOLD, SILVER, BRONZE
	
	private final String OWNER_NAME = "ª—≤Ÿ";
	
	private final String SKILL_NAME = "∆„∆„∆„!";
	
	public PowerBazuka() {
		this("BLACK", "BRONZE");
	}
	
	public PowerBazuka(String color) {
		this.color = color;
		this.bombType = "BRONZE";
	}
	
	public PowerBazuka(String color, String bombType) {
		this.color = color;
		this.bombType = bombType;
	}

	@Override
	public String getSkillName() {
		return OWNER_NAME + " : " + SKILL_NAME;
	}
}