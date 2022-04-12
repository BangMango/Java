package customListQuiz;

import java.util.ArrayList;

public class CuttingBoard {
	private ArrayList<Salmon> salmonList;
	
	public void setSalmonList(ArrayList<Salmon> salmonList) {
		this.salmonList=salmonList;
	}
	
	private String translateSalmontype(String type) {
		if(type.equals("BIG")) {
			return "ū ����";
		}else if(type.equals("MEDIUM")) {
			return "�߰� ����";
		}else {
			return "���� ����";
		}
	}
	private String translateSalmontype2(String type) {
		switch(type) {
			case "BIG":
				return "ū ����";
			case "MEDIUM":
				return "�߰� ����";
			case "SMALL":
				return "���� ����";
			default :
				return "��� �����ϴ�.";
			
		}
	}
	public void printSalmon() {
		System.out.println("===���� ����===");
		if(salmonList.size()>0) {
			for(int i=0; i<salmonList.size();i++) {
			System.out.println(translateSalmontype(salmonList.get(i).getType()));
			}
		}else {
			System.out.println("��� ��� �����Ǿ����ϴ�.");
		}
		System.out.println("============");
	}
}