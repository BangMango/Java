package virtualGame;

public class PlayGround {
	
	public static String CAT_NAME="���ʵ�";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ownMonsterList= {"���������","����","�˰�����"};
		
		VirtualMF vm=new VirtualMF(ownMonsterList);
		
		vm.printMonsterInfo(0);
		vm.printMonsterInfo(1);
		vm.printMonsterInfo(2);
		
		for(int i=0;i<ownMonsterList.length;i++) {
			vm.printMonsterInfo(i);
			if(i==0) {
				System.out.println(CAT_NAME+" : 5�� ĳ���;�!");
			}
		}
	}
}
