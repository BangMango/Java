package pokemon;

public class Entry {
	public Pokemon [] entryList;
	public String name;
	Entry(){
		entryList=new Pokemon[6];
		name="기본 엔트리";
		System.out.println("엔트리의 이름은 "+name+"입니다.");
	}
	Entry(Integer num){
		entryList=new Pokemon[num];
	}
	//엔트리에 포켓몬 추가
	public void addPokemon(Integer entryindex,Pokemon pokemon) {
		entryList[entryindex]=pokemon;
	}
	//포켓몬 개별정보 출력
	public void printPokemon(Pokemon pokemon) {
		System.out.println("포켓몬 이름 : "+pokemon.name);
		System.out.println("포켓몬 타입 : "+pokemon.type);
		System.out.println("포켓몬 레벨 : "+pokemon.status.level);
		System.out.println("===========================");
		System.out.println("포켓몬 기술1 : "+pokemon.skill1.name);
		System.out.println("포켓몬 기술1 타입 : "+pokemon.skill1.type);
		System.out.println("포켓몬 기술1 pp : "+pokemon.skill1.pp);
		System.out.println("===========================");
		System.out.println("포켓몬 기술2 : "+pokemon.skill2.name);
		System.out.println("포켓몬 기술2 타입 : "+pokemon.skill2.type);
		System.out.println("포켓몬 기술2 pp : "+pokemon.skill2.pp);
		System.out.println("===========================");
		System.out.println("포켓몬 기술3 : "+pokemon.skill3.name);
		System.out.println("포켓몬 기술3 타입 : "+pokemon.skill3.type);
		System.out.println("포켓몬 기술3 pp : "+pokemon.skill3.pp);
		System.out.println("===========================");
		System.out.println("포켓몬 기술4 : "+pokemon.skill4.name);
		System.out.println("포켓몬 기술4 타입 : "+pokemon.skill4.type);
		System.out.println("포켓몬 기술4 pp : "+pokemon.skill4.pp);
		System.out.println();
		System.out.println();
	}
	//엔트리에 있는 모든 포켓몬 이름,레벨 출력
	public void printAllPokemon() {
		for(int i=0;i<entryList.length;i++) {
			System.out.println(i+1+"번째 포켓몬 이름 : "+entryList[i].name);
			System.out.println(i+1+"번째 포켓몬 레벨 : "+entryList[i].status.level);
			System.out.println();
		}
	}
	
	public Pokemon returnPokemon(Integer index) {
	return	entryList[index];
	}
}
