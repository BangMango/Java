package Encapsulation;

public class CatMountain {

	public static void main(String[] args) {
		CatTower ct=new CatTower();
		
		//ȣ�⳻�� ���
		System.out.println(ct.getSupportCnt());
		
		//�缱��(���Ҵ�)
		ct.setSupportCnt(6);
		
		//�缱��(���Ҵ�)�� ���� ���
		System.out.println(ct.getSupportCnt());

	}

}
