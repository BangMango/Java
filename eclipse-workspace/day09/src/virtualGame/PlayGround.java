package virtualGame;

public class PlayGround {

	public static void main(String[] args) {
		VirtualMonster[] virtualList =new VirtualMonster[3];
		VirtualMonster vm1=new VirtualMonster(0L,"������ ��","�ϼ����� ���� ������ �� �Դϴ�.");
		VirtualMonster vm2=new VirtualMonster(1L,"���� ��","������ ���� ���� �� �Դϴ�.");
		VirtualMonster vm3=new VirtualMonster(2L,"������ ��","���� ������ ���� ������ �� �Դϴ�.");
		virtualList[0]=vm1;
		virtualList[1]=vm2;
		virtualList[2]=vm3;
		for(int i=0;i<virtualList.length;i++) {
			virtualList[i].printMonster(virtualList[i]);
		}

	}

}
