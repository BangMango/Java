package pokemon;

public class Evee extends Pokemon{
	Evee(){
		this.name="�̺���";
		this.type="�븻";
		this.skill1=new Skill();
		this.skill2=new Skill("normal","��������",40);
		this.skill3=new Skill("fairy","õ���� Ű��",15);
		this.skill4=new Skill("normal","�����",10);
		this.status=new Status("ҳ",12,24);
	}
}
