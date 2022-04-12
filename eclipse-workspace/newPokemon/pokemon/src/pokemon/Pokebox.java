package pokemon;

public class Pokebox {
	
	// 최초 스타팅 entry
	public static Entry startEntry;
	
	// 중간 진화 entry
	public static Entry revMiddleEntry;
	
	// 최종 진화 entry
	public static Entry revFinalEntry;
	
	private static void circuitEntryForDataSet(Entry entry, Pokemon[] pokemonList) {
		for(int i=0; i < entry.pokemonList.length; i++) {
			
			if(i==0) {
				
				entry.addPokemon(i, pokemonList[0]);
			}else if(i==1) {
				
				entry.addPokemon(i, pokemonList[1]);
			}else {
				
				entry.addPokemon(i, pokemonList[2]);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		//1 스타팅 엔트리 로직 시작
		
		//1.1 스타팅 엔트리 생성
		startEntry = new Entry();
		
		//1.2 각 포켓몬 생성
		// 기본생성자가 스타팅
		StrangeFlower strangeSeed = new StrangeFlower();
		Turtleking tutleBaby = new Turtleking();
		Lizamon paelee = new Lizamon();
		
		//1.3 포켓몬 추가
		// 엔트리에 각각 스타팅 포켓몬 추가
		startEntry.addPokemon(0, strangeSeed);
		startEntry.addPokemon(1, tutleBaby);
		startEntry.addPokemon(2, paelee);
		System.out.println();
		
		//1.4 그 후, 스타팅 엔트리의 모든 포켓몬 정보 출력
		startEntry.printAllPokemon();
		System.out.println();
		
		//1.5 스타팅 엔트리 특정 index에 소속된 포켓몬 정보 출력
		// - 파이리의 정보 출력(아래와 똑같은 정보가 두번 출력되므로 주석처리 하였습니다.)
		// startEntry.printPokemon(2);
		// System.out.println();
		
		//1.5 똑같이 출력(오버로딩)
		// - 매개변수만 다르게하여(오버로딩) 포켓몬의 정보 출력
		System.out.println("특정 포켓몬 정보 출력");
		startEntry.printPokemon(paelee);
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//2 진화체 엔트리 로직 시작
		//2.1 진화체 엔트리 생성
		revMiddleEntry = new Entry("중간 진화체");
		
		//2.2 각 포켓몬 생성
		StrangeFlower strangeGrass = new StrangeFlower("이상해풀",30,"꽃잎댄스","기가드레인");
		Turtleking tutlePuberty = new Turtleking("어니부기",26,"파도타기","물놀이");
		Lizamon lizard = new Lizamon("리자드",28,"불대문자","물기");
		
		//2.3 중간 진화체 entry data setting 하기
		Pokemon[] middleEntryPokemonList = new Pokemon[3];
		middleEntryPokemonList[0] = strangeGrass;
		middleEntryPokemonList[1] = tutlePuberty;
		middleEntryPokemonList[2] = lizard;
		circuitEntryForDataSet(revMiddleEntry, middleEntryPokemonList);
		
		//2.4 모든 포켓몬 출력
		revMiddleEntry.printAllPokemon();
		System.out.println();
		
		//2.5 포켓몬 개별출력 배열 값 집어넣기
		revMiddleEntry.printPokemon(revMiddleEntry.pokemonList[1]);
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//최종 진화체 엔트리 로직 시작
		//3.1 최종 진화체 엔트리 생성
		revFinalEntry = new Entry(3,"최종 진화체");
		
		//3.2 각 포켓몬 생성
		
		//3.2.1 매개변수 기본 데이터타입 생성자
		StrangeFlower strangeFlower =new StrangeFlower("이상해꽃",60,"풀, 독",false,true,"학습장치","리프스톰","맹독");
		Turtleking turtleKing = new Turtleking("거북왕",90,"물",true,true,"먹다남은 음식","하이드로펌프","물대포");
		
		//3.2.2 매개변수 클래스 데이터타입 생성자 생성
		// (리자몽의 경우 특별하게 status와 tool 그리고 skill 생성)
		//정보 생성
		Status status = new Status();
		status.name = "리자몽";
		status.irochi = true;
		status.level = 100;
		status.type = "불, 비행";
		
		//스킬 생성
		Skill skill =new Skill();
		skill.main = "블러스트번";
		skill.sub = "에어슬래쉬";
		
		//도구 생성
		Tool tool = new Tool();
		tool.had = true;
		tool.name ="꺼지지않는 불씨";
		
		//클래스 데이터타입을 매개변수로 받는 생성자 생성 완료
		Lizamon lizamon = new Lizamon(status, skill, tool);
		
		// 최종 진화체 entry data setting 하기
		Pokemon[] finalEntryPokemonList = new Pokemon[3];
		finalEntryPokemonList[0] = strangeFlower;
		finalEntryPokemonList[1] = turtleKing;
		finalEntryPokemonList[2] = lizamon;
		circuitEntryForDataSet(revFinalEntry, finalEntryPokemonList);
		
		revFinalEntry.printAllPokemon();
		System.out.println();
		
		revFinalEntry.printPokemon(1);
		System.out.println();
		
		revFinalEntry.printPokemon(2);
	}
}
