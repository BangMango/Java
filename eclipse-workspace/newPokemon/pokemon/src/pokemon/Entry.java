package pokemon;

public class Entry {
	
	public Pokemon[] pokemonList;
	public String entryName;
	
	Entry(){
		pokemonList = new Pokemon[3];
		this.entryName="스타팅";
		
		System.out.println("기본 엔트리 생성 완료");
		System.out.println("==============================");
		System.out.println("엔트리에 3개의 공간이 생성됐습니다.");
		System.out.println();
	}
	
	Entry(String name){
		pokemonList = new Pokemon[3];
		this.entryName = name;
		
		System.out.println(name+" 엔트리 생성 완료");
		System.out.println("==============================");
		System.out.println("엔트리에 3개의 공간이 생성됐습니다.");
		System.out.println();
	}
	
	Entry(Integer index, String name ){
		pokemonList = new Pokemon[index];
		this.entryName = name;
		
		System.out.println(name+" 엔트리 생성 완료");
		System.out.println("==============================");
		System.out.println("엔트리에 "+index+"개의 공간이 생성됐습니다.");
		System.out.println();
	}
	
	public void addPokemon(Integer index, Pokemon pokemon) {
		pokemonList[index] = pokemon;
		System.out.println(entryName+" 엔트리의 "+(index+1)+"번째 공간에 "+pokemon.st.name+"이(가) 배정되었습니다.");
	}
	
	//개별 포켓몬 정보 출력
	public void printPokemon(Pokemon pokemon) {
		System.out.println(pokemon.st.name+"의 정보");
		System.out.print(pokemon.st.name+"의 레벨 :"+pokemon.st.level+"  ");
		System.out.print(pokemon.st.name+"의 도구 : "+pokemon.t.name+"  ");
		System.out.print(pokemon.st.name+"의 메인스킬 :"+pokemon.s.main+"  ");
		System.out.print(pokemon.st.name+"의 서브스킬 : "+pokemon.s.sub+"  ");
	}
	
	//개별 포켓몬 정보 출력 오버로딩
	public void printPokemon(Integer index) {
		System.out.println(pokemonList[index].st.name+"의 정보");
		System.out.print(pokemonList[index].st.name+"의 레밸 : "+pokemonList[index].st.level+"  ");
		System.out.print(pokemonList[index].st.name+"의 도구 : "+pokemonList[index].t.name+"  ");
		System.out.print(pokemonList[index].st.name+"의 메인스킬 : "+pokemonList[index].s.main+"  ");
		System.out.print(pokemonList[index].st.name+"의 서브스킬 : "+pokemonList[index].s.sub+"  ");	
		
		if(pokemonList[index].st.irochi==true) {
			System.out.println(pokemonList[index].st.name+"은 색이 다른 희귀한 포켓몬입니다.");
		}
	}
	
	public void printAllPokemon() {
		System.out.println(entryName+" 엔트리의 모든 포켓몬");
	
		//배열 출력을 편하게 하는 for each문법
		for(Pokemon i: pokemonList) {
			System.out.println(i.st.name+" Lv."+i.st.level+" ["+i.st.type+"] 타입    ");
		}
	}
	
}
