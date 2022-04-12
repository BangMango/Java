package customListExample;

import java.util.ArrayList;

public class CandyBox {
	// ��������(��������)
	private ArrayList<Candy> candyList;
	
	public void initCandyList() {
		//������
		candyList= new ArrayList();
	}
	//��������(��������) set �޼ҵ�
	public void setCandyList(ArrayList<Candy> candyList) {
		if(candyList==null) {
			initCandyList();
		}
		if(candyList.size()<13) {
			this.candyList=candyList;
		}else {
			System.out.println("�Ѱ��� �ڽ����� 12���� ���� ������ �ʰ��ؼ� ���� �� �����ϴ�.");
		}
	}
	//��������(��������) get �޼ҵ�
	public ArrayList<Candy> getCandyList(){
		return candyList;
	}
	
	private String translateColor(String color) {
		switch(color) {
		case "RED":
			return "������";
			
		case "YELLOW":
			return "�����";
		
		case "BLUE":
			return "�Ķ���";
			
		default:
			return "�Ͼ��";
		}
	}
	
	private String translateFlavor(String flavor) {
		switch(flavor) {
		case "GINGER":
			return "������";
		case "FRUIT":
			return "���ϸ�";
		case "HONEY":
			return "�ܸ�";
		case "BUTTER":
			return "���͸�";
		default:
			return "����";
		}
	}
	
	private String translateShape(String shape) {
		switch(shape) {
		case "CIRCLE":
			return "���׶� ���";
		case "RECTANGLE":
			return "�׸� ���";
			
		default:
			return "�����";
		}
	}
	
	//
	public void printCandyList() {
		System.out.println("==================");
		
		for(int i=0; i<candyList.size();i++) {
			
			String color=candyList.get(i).getColor();
			String flavor=candyList.get(i).getFlavor();
			String shape=candyList.get(i).getShape();
			
			System.out.println(i+"��° ���� ����");
			System.out.println(i+"��° ���� �� : "+translateColor(color));
			System.out.println(i+"��° ���� �� : "+translateFlavor(flavor));
			System.out.println(i+"��° ���� ��� : "+translateShape(shape));
			
			System.out.println("=================");
		}
		
		System.out.println("==================");
	}
	

}
