package pokemon;

public class Skill {
	public String type;
	public String name;
	public Integer pp;
	Skill(){	
		this.type="normal";
		this.name="�����ġ��";
		this.pp=40;
	}
	Skill(String type, String name, Integer pp){
			this.type=type;
			this.name=name;
			this.pp=pp;
	}
}
