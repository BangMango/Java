package virtualGame;

public class PlayGround {

	public static void main(String[] args) {
		VirtualMonster[] virtualList =new VirtualMonster[3];
		VirtualMonster vm1=new VirtualMonster(0L,"파이터 쥐","하수구의 고독한 파이터 쥐 입니다.");
		VirtualMonster vm2=new VirtualMonster(1L,"전사 쥐","전장의 고독한 전사 쥐 입니다.");
		VirtualMonster vm3=new VirtualMonster(2L,"마법사 쥐","마법 세계의 고독한 마법사 쥐 입니다.");
		virtualList[0]=vm1;
		virtualList[1]=vm2;
		virtualList[2]=vm3;
		for(int i=0;i<virtualList.length;i++) {
			virtualList[i].printMonster(virtualList[i]);
		}

	}

}
