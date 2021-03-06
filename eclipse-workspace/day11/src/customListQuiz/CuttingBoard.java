package customListQuiz;

import java.util.ArrayList;

public class CuttingBoard {
	private ArrayList<Salmon> salmonList;
	
	public void setSalmonList(ArrayList<Salmon> salmonList) {
		this.salmonList=salmonList;
	}
	
	private String translateSalmontype(String type) {
		if(type.equals("BIG")) {
			return "큰 연어";
		}else if(type.equals("MEDIUM")) {
			return "중간 연어";
		}else {
			return "작은 연어";
		}
	}
	private String translateSalmontype2(String type) {
		switch(type) {
			case "BIG":
				return "큰 연어";
			case "MEDIUM":
				return "중간 연어";
			case "SMALL":
				return "작은 연어";
			default :
				return "연어가 없습니다.";
			
		}
	}
	public void printSalmon() {
		System.out.println("===남은 연어===");
		if(salmonList.size()>0) {
			for(int i=0; i<salmonList.size();i++) {
			System.out.println(translateSalmontype(salmonList.get(i).getType()));
			}
		}else {
			System.out.println("모든 연어가 소진되었습니다.");
		}
		System.out.println("============");
	}
}
