package virtualGame;

public class VirtualMonster {
	Long monsterNo;
	String name;
	String explain;
	VirtualMonster(){
		
	}
	VirtualMonster(Long no, String name, String explain) {
		this.monsterNo=no; this.name=name; this.explain=explain;
	}
	
	public void printMonster(VirtualMonster vm) {
		System.out.println("가상 몬스터 도감을 열어보자(철커덕)");
		System.out.println("몬스터 번호 : "+vm.monsterNo);
		System.out.println("몬스터 이름 : "+vm.name);
		System.out.println("몬스터 설명 : "+vm.explain);
		System.out.println();
	}
}
