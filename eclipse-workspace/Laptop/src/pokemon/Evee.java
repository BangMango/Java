package pokemon;

public class Evee extends Pokemon{
	Evee(){
		this.name="이브이";
		this.type="노말";
		this.skill1=new Skill();
		this.skill2=new Skill("normal","꼬리흔들기",40);
		this.skill3=new Skill("fairy","천사의 키스",15);
		this.skill4=new Skill("normal","도우미",10);
		this.status=new Status("女",12,24);
	}
}
