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
		System.out.println("���� ���� ������ �����(öĿ��)");
		System.out.println("���� ��ȣ : "+vm.monsterNo);
		System.out.println("���� �̸� : "+vm.name);
		System.out.println("���� ���� : "+vm.explain);
		System.out.println();
	}
}
