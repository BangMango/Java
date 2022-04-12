package pokemon;

public class Status {
	//default value
	public String gender;
	public Integer level;
	public Integer hp;
	
	Status(){
		this.gender="Ñû";
		this.level=5;
		this.hp=50;
	}
	Status(String gender, Integer level, Integer hp){
		this.gender=gender;
		this.level=level;
		this.hp=hp;
	}
}
