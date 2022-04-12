package customListExample;

import java.util.ArrayList;

public class CandyFactory {

	public static void main(String[] args) {
		ArrayList<Candy> candyBundleList =new ArrayList();
		//모양 동그랗게 통일
		
		//1 빨간생각
		Candy redGingerCandy=new Candy();
		redGingerCandy.setColor("RED");
		redGingerCandy.setFlavor("GINGER");
		redGingerCandy.setShape("CIRCLE");
		//2 빨간과일
		Candy redFruitCandy=new Candy();
		redFruitCandy.setColor("RED");
		redFruitCandy.setFlavor("FRUIT");
		redFruitCandy.setShape("CIRCLE");
		//3 빨간 꿀
		Candy redHoneyCandy=new Candy();
		redHoneyCandy.setColor("RED");
		redHoneyCandy.setFlavor("HONEY");
		redHoneyCandy.setShape("CIRCLE");
		//4 파란 생강
		Candy blueGingerCandy=new Candy();
		blueGingerCandy.setColor("BLUE");
		blueGingerCandy.setFlavor("GINGER");
		blueGingerCandy.setShape("CIRCLE");
		//5 파란 과일
		Candy blueFruitCandy=new Candy();
		blueFruitCandy.setColor("BLUE");
		blueFruitCandy.setFlavor("FRUIT");
		blueFruitCandy.setShape("CIRCLE");
		//6 파란 꿀
		Candy blueHoneyCandy=new Candy();
		blueHoneyCandy.setColor("BLUE");
		blueHoneyCandy.setFlavor("HONEY");
		blueHoneyCandy.setShape("CIRCLE");
		//7 노란 생강
		Candy yellowGingerCandy =new Candy();
		yellowGingerCandy.setColor("YELLOW");
		yellowGingerCandy.setFlavor("GINGER");
		yellowGingerCandy.setShape("CIRCLE");
		//8 노란 과일
		Candy yellowFruitCandy=new Candy();
		yellowFruitCandy.setColor("YELLOW");
		yellowFruitCandy.setFlavor("FRUIT");
		yellowFruitCandy.setShape("CIRCLE");
		//9 노란 꿀
		Candy yellowHoneyCandy=new Candy();
		yellowHoneyCandy.setColor("YELLOW");
		yellowHoneyCandy.setFlavor("HONEY");
		yellowHoneyCandy.setShape("CIRCLE");
		
		// 사탕번들에 사탕 추가
		candyBundleList.add(redGingerCandy);
		candyBundleList.add(redFruitCandy);
		candyBundleList.add(redHoneyCandy);
		candyBundleList.add(blueGingerCandy);
		candyBundleList.add(blueFruitCandy);
		candyBundleList.add(blueHoneyCandy);
		candyBundleList.add(yellowGingerCandy);
		candyBundleList.add(yellowFruitCandy);
		candyBundleList.add(yellowHoneyCandy);
		
		//사탕 상자를 열고 사탕 번들 넣기
		CandyBox candyBox=new CandyBox();
		candyBox.initCandyList();
		candyBox.setCandyList(candyBundleList);
		//사탕박스 완성
		candyBox.printCandyList();
		
		System.out.println("고된 아르바이트가 끝났다옹");
	}

}
