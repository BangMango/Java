package pokemon;

public class StrangeFlower extends Pokemon{
	
	StrangeFlower(){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.st.name="이상해씨";
		this.st.irochi=false;
		this.st.level=5;
		this.st.type="풀";
		this.s.main="잎날가르기";
		this.s.sub="째려보기";
		this.t.had=false;
		if(this.t.had==false) {
			this.t.name="None";
		}
	}
	
	StrangeFlower(String name, Integer level, String main, String sub){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.st.name=name;
		this.st.level=level;
		this.s.main=main;
		this.s.sub=sub;
		
		this.st.type="풀";
		this.st.irochi=false;
		this.t.had=false;
		if(this.t.had==false) {
			this.t.name="None";
		}
	}
	
	StrangeFlower(String s_name, Integer level, String type, boolean irochi, boolean had, String t_name, String main, String sub){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.st.name=s_name;
		this.st.level=level;
		this.st.type=type;
		this.st.irochi=irochi;
		this.t.had=had;
		if(this.t.had==false) {
			this.t.name="None";
		}else {
			this.t.name=t_name;
		}
		this.s.main=main;
		this.s.sub=sub;
	}
	
	StrangeFlower(Status st, Skill s, Tool t){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.s=s;
		this.st=st;
		this.t=t;
	}
}
