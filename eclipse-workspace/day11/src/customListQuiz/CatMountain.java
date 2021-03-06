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
		System.out.println("1차 연어");
		cb.printSalmon();
		System.out.println("세미가 모든 큰 연어를 먹었다.");
		salmonList.remove(0); salmonList.remove(0);
		cb.printSalmon();
		System.out.println("다이어트 중인 수미는 작은 연어만 먹었다.");
		salmonList.remove(3); salmonList.remove(3);
		cb.printSalmon();
		System.out.println("소미는 남은 연어를 모두 먹어치웠다.");
		salmonList.removeAll(salmonList);
		cb.printSalmon();
	}

}
