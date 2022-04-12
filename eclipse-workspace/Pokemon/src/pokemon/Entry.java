package pokemon;

public class Entry {
	public Pokemon[] p_List;
	public String entry_Name;
	
	Entry(){
		p_List=new Pokemon[3];
		this.entry_Name="스타팅";
		System.out.println("기본 엔트리 생성 완료");
		System.out.println("==============================");
		System.out.println("엔트리에 3개의 공간이 생성됐습니다.");
		System.out.println();
	}
	Entry(String name){
		this.entry_Name=name;
		p_List=new Pokemon[3];
		System.out.println(name+" 엔트리 생성 완료");
		System.out.println("==============================");
		System.out.println("엔트리에 3개의 공간이 생성됐습니다.");
		System.out.println();
	}
	
	Entry(Integer index, String name ){
		this.entry_Name=name;
		p_List=new Pokemon[index];
		System.out.println(name+" 엔트리 생성 완료");
		System.out.println("==============================");
		System.out.println("엔트리에 "+index+"개의 공간이 생성됐습니다.");
		System.out.println();
	}
	
	public void addPokemon(Integer index, Pokemon p) {
		p_List[index]=p;
		System.out.println(entry_Name+" 엔트리의 "+(index+1)+"번째 공간에 "+p.st.name+"이(가) 배정되었습니다.");
	}
	//개별 포켓몬 정보 출력
	public void printPokemon(Pokemon p) {
		System.out.println(p.st.name+"의 정보");
		System.out.print(p.st.name+"의 레벨 :"+p.st.level+"  ");
		System.out.print(p.st.name+"의 도구 : "+p.t.name+"  ");
		System.out.print(p.st.name+"의 메인스킬 :"+p.s.main+"  ");
		System.out.print(p.st.name+"의 서브스킬 : "+p.s.sub+"  ");
	}
	//개별 포켓몬 정보 출력 오버로딩
	public void printPokemon(Integer index) {
		System.out.println(p_List[index].st.name+"의 정보");
		System.out.print(p_List[index].st.name+"의 레밸 : "+p_List[index].st.level+"  ");
		System.out.print(p_List[index].st.name+"의 도구 : "+p_List[index].t.name+"  ");
		System.out.print(p_List[index].st.name+"의 메인스킬 : "+p_List[index].s.main+"  ");
		System.out.print(p_List[index].st.name+"의 서브스킬 : "+p_List[index].s.sub+"  ");	
		if(p_List[index].st.irochi==true) {
			System.out.println(p_List[index].st.name+"은 색이 다른 희귀한 포켓몬입니다.");
		}
	}
	public void printAllPokemon() {
		System.out.println(entry_Name+" 엔트리의 모든 포켓몬");
		//for문의 기본 형태
		/*for(int i=0; i<p_List.length;i++) {
			System.out.print(p_List[i].st.name+" ("+p_List[i].st.level+") ["+p_List[i].st.type+"]");
			System.out.println();
		}*/
		//배열 출력을 편하게 하는 for each문법
		for(Pokemon i:p_List) {
			System.out.println(i.st.name+" Lv."+i.st.level+" ["+i.st.type+"] 타입    ");
		}
	}
	
}
