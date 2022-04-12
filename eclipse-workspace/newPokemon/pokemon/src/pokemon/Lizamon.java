package pokemon;

public class Lizamon extends Pokemon{
	
	// 기본 생성자
	Lizamon(){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.st.name="파이리";
		this.st.irochi=false;
		this.st.level=5;
		this.st.type="불";
		this.s.main="화염방사";
		this.s.sub="할퀴기";
		this.t.had=false;
		if(this.t.had==false) {
			this.t.name="None";
		}
	}
	
	//매개변수 기본데이터타입으로 받는 생성자
	Lizamon(String name, Integer level, String main, String sub){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.st.name=name;
		this.st.level=level;
		this.s.main=main;
		this.s.sub=sub;
		
		this.st.type="불";
		this.st.irochi=false;
		this.t.had=false;
		if(this.t.had==false) {
			this.t.name="None";
		}
	}
	
	Lizamon(String s_name, Integer level, String type, boolean irochi, boolean had, String t_name, String main, String sub){
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
	
	//매개변수 클래스로 받는 생성자
	Lizamon(Status st, Skill s, Tool t){
		this.st=new Status();
		this.s=new Skill();
		this.t=new Tool();
		this.s=s;
		this.st=st;
		this.t=t;
	}
}
