package customListQuiz;

import java.util.ArrayList;

public class CatMountain {

	public static void main(String[] args) {
		ArrayList<Salmon> salmonList=new ArrayList();
		CuttingBoard cb=new CuttingBoard();
		Salmon bigSalmon=new Salmon();
		bigSalmon.setType("BIG");
		Salmon mediumSalmon=new Salmon();
		mediumSalmon.setType("MEDIUM");
		Salmon smallSalmon=new Salmon();
		smallSalmon.setType("SMALL");
		for(int i=0; i<2;i++) {
			salmonList.add(bigSalmon);
		}
		for(int i=0; i<3; i++) {
			salmonList.add(mediumSalmon);
		}
		for(int i=0; i<2;i++) {
			salmonList.add(smallSalmon);
		}
		cb.setSalmonList(salmonList);
		System.out.println("1�� ����");
		cb.printSalmon();
		System.out.println("���̰� ��� ū ��� �Ծ���.");
		salmonList.remove(0); salmonList.remove(0);
		cb.printSalmon();
		System.out.println("���̾�Ʈ ���� ���̴� ���� ��� �Ծ���.");
		salmonList.remove(3); salmonList.remove(3);
		cb.printSalmon();
		System.out.println("�ҹ̴� ���� ��� ��� �Ծ�ġ����.");
		salmonList.removeAll(salmonList);
		cb.printSalmon();
	}

}