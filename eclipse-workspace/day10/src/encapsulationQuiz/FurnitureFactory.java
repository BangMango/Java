package encapsulationQuiz;

public class FurnitureFactory {

	public static void main(String[] args) {
		Table t=new Table();
		t.setLegCnt(4); t.setCircleCnt(1);
		System.out.println("�ٸ� "+t.getLegCnt()+"���� ���� "+t.getCircleCnt()+"�� ¥�� ������ �����Ǿ����ϴ�.");
		t.setLegCnt(6);
		System.out.println("�ٸ� "+t.getLegCnt()+"���� ���� "+t.getCircleCnt()+"�� ¥�� ������ �������Ǿ����ϴ�.");

	}

}
