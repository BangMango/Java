package pokemon;

public class Pokebox {
	public static Entry start_entry;
	public static Entry rev1_entry;
	public static Entry rev2_entry;
	public static void main(String[] args) {
		//1 스타팅 엔트리 로직 시작
		
		//1.1 스타팅 엔트리 생성
		start_entry=new Entry();
		
		//1.2 각 포켓몬 생성 (기본생성자가 스타팅)
		Green g_starting=new Green();
		Turtleking t_starting=new Turtleking();
		Lizamon l_starting=new Lizamon();
		//1.3 포켓몬 추가
		start_entry.addPokemon(0, g_starting);
		start_entry.addPokemon(1, t_starting);
		start_entry.addPokemon(2, l_starting);
		System.out.println();
		//1.4 스타팅 엔트리 모든 포켓몬 출력
		start_entry.printAllPokemon();
		System.out.println();
		//1.5 스타팅 엔트리 특정 index에 소속된 포켓몬 정보 출력
		start_entry.printPokemon(2);
		System.out.println();
		//1.5 똑같이 출력(오버로딩)
		start_entry.printPokemon(g_starting);
		
		//2 진화체 엔트리 로직 시작
		//2.1 진화체 엔트리 생성
		rev1_entry=new Entry("중간 진화체");
		
		//2.2 각 포켓몬 생성
		Green g_rev1=new Green("이상해풀",30,"꽃잎댄스","기가드레인");
		Turtleking t_rev1=new Turtleking("어니부기",26,"파도타기","물놀이");
		Lizamon l_rev1=new Lizamon("리자드",28,"불대문자","물기");
		//2.3 반복문+조건문으로 집어넣기
		for(int i=0;i<rev1_entry.p_List.length;i++) {
			if(i==0) {
				rev1_entry.addPokemon(i, g_rev1);
			}else if(i==1) {
				rev1_entry.addPokemon(i, t_rev1);
			}else {
				rev1_entry.addPokemon(i, l_rev1);
			}
		}
		System.out.println();
		//2.4 모든 포켓몬 출력
		rev1_entry.printAllPokemon();
		System.out.println();
		//2.5 포켓몬 개별출력 배열 값 집어넣기
		rev1_entry.printPokemon(rev1_entry.p_List[1]);
		System.out.println();
		//최종 진화체 엔트리 로직 시작
		//3.1 최종 진화체 엔트리 생성
		rev2_entry=new Entry(3,"최종 진화체");
		
		//3.2 각 포켓몬 생성
		//3.2.1 매개변수 기본 데이터타입 생성자
		Green g_rev2=new Green("이상해꽃",60,"풀, 독",false,true,"학습장치","리프스톰","맹독");
		Turtleking t_rev2=new Turtleking("거북왕",90,"물",true,true,"먹다남은 음식","하이드로펌프","물대포");
		//3.2.2 매개변수 클래스 데이터타입 생성자 생성
		//정보 생성
		Status st=new Status();
		st.name="리자몽"; st.irochi=true; st.level=100; st.type="불, 비행";
		//도구 생성
		Tool t=new Tool();
		t.had=true; t.name="꺼지지않는 불씨";
		//스킬 생성
		Skill s=new Skill();
		s.main="블러스트번"; s.sub="에어슬래쉬";
		//클래스 데이터타입을 매개변수로 받는 생성자 생성 완료
		Lizamon l_rev2=new Lizamon(st,s,t);
		
		for(int i=0;i<rev2_entry.p_List.length;i++) {
			if(i==0) {
				rev2_entry.addPokemon(i, g_rev2);
			}else if(i==2) {
				rev2_entry.addPokemon(i, t_rev2);
			}else {
				rev2_entry.addPokemon(i, l_rev2);
			}
		}
		System.out.println();
		rev2_entry.printAllPokemon();
		System.out.println();
		rev2_entry.printPokemon(1);
		System.out.println();
		rev2_entry.printPokemon(2);
	}

}
