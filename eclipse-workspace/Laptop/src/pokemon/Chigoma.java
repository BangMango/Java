package pokemon;

public class Chigoma extends Pokemon{
	//default 생성자
	Chigoma(){
		this.name="치고마";
		this.type="격투";
		this.skill1=new Skill();
		this.skill2=new Skill("normal","째려보기",40);
		this.skill3=new Skill("fight","태권당수",15);
		this.skill4=new Skill("fight","기합구슬",5);
		this.status=new Status();
	}
	
Chigoma(Skill skill1,Skill skill2,Skill skill3,Skill skill4,Status status){
		this.name="치고마";
		this.type="격투";
		this.skill1=skill1;
		this.skill2=skill2;
		this.skill3=skill3;
		this.skill4=skill4;
		this.status=status;
	}
	
	Chigoma(Skill skill1,Skill skill2,Skill skill3,Skill skill4,Status status, String name){
		//매개변수X
		this.type="격투";
		//매개변수O
		this.skill1=skill1;
		this.skill2=skill2;
		this.skill3=skill3;
		this.skill4=skill4;
		this.status=status;
		this.name=name;
	}
}
