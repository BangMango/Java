package customListExample;

import java.util.ArrayList;

public class CandyFactory {

	public static void main(String[] args) {
		ArrayList<Candy> candyBundleList =new ArrayList();
		//��� ���׶��� ����
		
		//1 ��������
		Candy redGingerCandy=new Candy();
		redGingerCandy.setColor("RED");
		redGingerCandy.setFlavor("GINGER");
		redGingerCandy.setShape("CIRCLE");
		//2 ��������
		Candy redFruitCandy=new Candy();
		redFruitCandy.setColor("RED");
		redFruitCandy.setFlavor("FRUIT");
		redFruitCandy.setShape("CIRCLE");
		//3 ���� ��
		Candy redHoneyCandy=new Candy();
		redHoneyCandy.setColor("RED");
		redHoneyCandy.setFlavor("HONEY");
		redHoneyCandy.setShape("CIRCLE");
		//4 �Ķ� ����
		Candy blueGingerCandy=new Candy();
		blueGingerCandy.setColor("BLUE");
		blueGingerCandy.setFlavor("GINGER");
		blueGingerCandy.setShape("CIRCLE");
		//5 �Ķ� ����
		Candy blueFruitCandy=new Candy();
		blueFruitCandy.setColor("BLUE");
		blueFruitCandy.setFlavor("FRUIT");
		blueFruitCandy.setShape("CIRCLE");
		//6 �Ķ� ��
		Candy blueHoneyCandy=new Candy();
		blueHoneyCandy.setColor("BLUE");
		blueHoneyCandy.setFlavor("HONEY");
		blueHoneyCandy.setShape("CIRCLE");
		//7 ��� ����
		Candy yellowGingerCandy =new Candy();
		yellowGingerCandy.setColor("YELLOW");
		yellowGingerCandy.setFlavor("GINGER");
		yellowGingerCandy.setShape("CIRCLE");
		//8 ��� ����
		Candy yellowFruitCandy=new Candy();
		yellowFruitCandy.setColor("YELLOW");
		yellowFruitCandy.setFlavor("FRUIT");
		yellowFruitCandy.setShape("CIRCLE");
		//9 ��� ��
		Candy yellowHoneyCandy=new Candy();
		yellowHoneyCandy.setColor("YELLOW");
		yellowHoneyCandy.setFlavor("HONEY");
		yellowHoneyCandy.setShape("CIRCLE");
		
		// �������鿡 ���� �߰�
		candyBundleList.add(redGingerCandy);
		candyBundleList.add(redFruitCandy);
		candyBundleList.add(redHoneyCandy);
		candyBundleList.add(blueGingerCandy);
		candyBundleList.add(blueFruitCandy);
		candyBundleList.add(blueHoneyCandy);
		candyBundleList.add(yellowGingerCandy);
		candyBundleList.add(yellowFruitCandy);
		candyBundleList.add(yellowHoneyCandy);
		
		//���� ���ڸ� ���� ���� ���� �ֱ�
		CandyBox candyBox=new CandyBox();
		candyBox.initCandyList();
		candyBox.setCandyList(candyBundleList);
		//�����ڽ� �ϼ�
		candyBox.printCandyList();
		
		System.out.println("��� �Ƹ�����Ʈ�� �����ٿ�");
	}

}
