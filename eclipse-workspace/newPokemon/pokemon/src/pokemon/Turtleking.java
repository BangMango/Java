package pokemon;

public class Turtleking extends Pokemon{
	
	Turtleking(){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.st.name="���α�";
		this.st.irochi=false;
		this.st.level=5;
		this.st.type="��";
		this.s.main="��ǰ����";
		this.s.sub="��������";
		this.t.had=false;
		
		if(this.t.had==false) {
			this.t.name="None";
		}
	}
	
	Turtleking(String name, Integer level, String main, String sub){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.st.name=name;
		this.st.level=level;
		this.s.main=main;
		this.s.sub=sub;
		
		this.st.type="��";
		this.st.irochi=false;
		this.t.had=false;
		if(this.t.had==false) {
			this.t.name="None";
		}
	}
	
	Turtleking(String s_name, Integer level, String type, boolean irochi, boolean had, String t_name, String main, String sub){
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
	
	Turtleking(Status st, Skill s, Tool t){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.s=s;
		this.st=st;
		this.t=t;
	}
}
