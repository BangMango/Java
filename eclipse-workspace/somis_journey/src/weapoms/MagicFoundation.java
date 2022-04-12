package weapoms;

public class MagicFoundation extends Weapon{
	
	private String color;
	private String foundationType; // DARK, LIGHT

	private final String OWNER_NAME = "¼Ò¹Ì";

	private final String SKILL_NAME = "»ß¸®Ä« »ß¸®¶ö¶ó ¸ÞÀÌÅ©¾÷ °ø°Ý~!";
	
	public MagicFoundation() {
		this("PINK", "DARK");
	}
	
	public MagicFoundation(String color) {
		this.color = color;
		this.foundationType = "DARK";
	}
	
	public MagicFoundation(String color, String foundationType) {
		this.color = color;
		this.foundationType = foundationType;
	}

	@Override
	public String getSkillName() {
			return OWNER_NAME + " : " + SKILL_NAME;
	}
}
