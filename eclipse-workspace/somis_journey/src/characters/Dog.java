package characters;

public class Dog extends Character{
	public static Integer HP = 100;
	public static Integer MP = 100;
	//state variable
	public boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("時時時次");
			pullPowerOrNot=false;
		}else {
			System.out.println("時時..時次..");
		}
	}
	
	public void eat() {
		System.out.println("拡拡拡");
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
