package pokemon;

public class Chigoma extends Pokemon{
	//default ������
	Chigoma(){
		this.name="ġ��";
		this.type="����";
		this.skill1=new Skill();
		this.skill2=new Skill("normal","°������",40);
		this.skill3=new Skill("fight","�±Ǵ��",15);
		this.skill4=new Skill("fight","���ձ���",5);
		this.status=new Status();
	}
	
Chigoma(Skill skill1,Skill skill2,Skill skill3,Skill skill4,Status status){
		this.name="ġ��";
		this.type="����";
		this.skill1=skill1;
		this.skill2=skill2;
		this.skill3=skill3;
		this.skill4=skill4;
		this.status=status;
	}
	
	Chigoma(Skill skill1,Skill skill2,Skill skill3,Skill skill4,Status status, String name){
		//�Ű�����X
		this.type="����";
		//�Ű�����O
		this.skill1=skill1;
		this.skill2=skill2;
		this.skill3=skill3;
		this.skill4=skill4;
		this.status=status;
		this.name=name;
	}
}
