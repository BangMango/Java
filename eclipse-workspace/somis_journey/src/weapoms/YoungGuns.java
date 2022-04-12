package weapoms;

public class YoungGuns extends Weapon{
	
	private String color;
	private String bulletType; // GOLD, SILVER, BRONZE

	private final String OWNER_NAME = "µŒƒ°";

	private final String SKILL_NAME = "≈¡≈¡≈¡!";
	
	public YoungGuns() {
		this("BLACK", "BRONZE");
	}
	
	public YoungGuns(String color) {
		this.color = color;
		this.bulletType = "BRONZE";
	}
	
	public YoungGuns(String color, String bulletType) {
		this.color = color;
		this.bulletType = bulletType;
	}

	@Override
	public String getSkillName() {
		return OWNER_NAME + " : " + SKILL_NAME;
	}
}