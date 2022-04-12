package Encapsulation;

public class CatMountain {

	public static void main(String[] args) {
		CatTower ct=new CatTower();
		
		//호출내용 출력
		System.out.println(ct.getSupportCnt());
		
		//재선언(재할당)
		ct.setSupportCnt(6);
		
		//재선언(재할당)된 내용 출력
		System.out.println(ct.getSupportCnt());

	}

}
