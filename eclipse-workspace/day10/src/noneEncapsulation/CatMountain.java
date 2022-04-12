package noneEncapsulation;

public class CatMountain {

	public static void main(String[] args) {
		CatTower catTower=new CatTower();
		
		System.out.println(catTower.supportCnt);
		System.out.println(catTower.fixtureCnt);
		
		catTower.supportCnt=6;
		System.out.println(catTower.supportCnt);
	}

}
