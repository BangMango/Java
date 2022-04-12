package characters;

public class Cat extends Character{
	public static Integer HP = 100;
	public static Integer MP = 100;
	public boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("¿ì´Ù´Ù´Ù´Ù");
			pullPowerOrNot=false;
		}else {
			System.out.println("¿ì´Ù..´Ù..");
		}
	}
	
	public void eat() {
		System.out.println("³È³È³È");
	}
	
	public void grooming() {
		System.out.println("½ºÀ¹½ºÀ¹½ºÀ¹");
	}
	public Integer getHp() {
		return HP;
	}
	public void setHp(Integer hp) {
		this.HP=hp;
	}
	public Integer getMp() {
		return MP;
	}
	public void setMp(Integer mp) {
		this.MP=mp;
	}
	}
