package customListExample;

import java.util.ArrayList;

public class CandyBox {
	// 사탕번들(사탕봉지)
	private ArrayList<Candy> candyList;
	
	public void initCandyList() {
		//생성자
		candyList= new ArrayList();
	}
	//사탕번들(사탕봉지) set 메소드
	public void setCandyList(ArrayList<Candy> candyList) {
		if(candyList==null) {
			initCandyList();
		}
		if(candyList.size()<13) {
			this.candyList=candyList;
		}else {
			System.out.println("한개의 박스에는 12개의 사탕 번들을 초과해서 넣을 수 없습니다.");
		}
	}
	//사탕번들(사탕봉지) get 메소드
	public ArrayList<Candy> getCandyList(){
		return candyList;
	}
	
	private String translateColor(String color) {
		switch(color) {
		case "RED":
			return "빨간색";
			
		case "YELLOW":
			return "노란색";
		
		case "BLUE":
			return "파란색";
			
		default:
			return "하얀색";
		}
	}
	
	private String translateFlavor(String flavor) {
		switch(flavor) {
		case "GINGER":
			return "생강맛";
		case "FRUIT":
			return "과일맛";
		case "HONEY":
			return "꿀맛";
		case "BUTTER":
			return "버터맛";
		default:
			return "무맛";
		}
	}
	
	private String translateShape(String shape) {
		switch(shape) {
		case "CIRCLE":
			return "동그란 모양";
		case "RECTANGLE":
			return "네모난 모양";
			
		default:
			return "별모양";
		}
	}
	
	//
	public void printCandyList() {
		System.out.println("==================");
		
		for(int i=0; i<candyList.size();i++) {
			
			String color=candyList.get(i).getColor();
			String flavor=candyList.get(i).getFlavor();
			String shape=candyList.get(i).getShape();
			
			System.out.println(i+"번째 사탕 정보");
			System.out.println(i+"번째 사탕 색 : "+translateColor(color));
			System.out.println(i+"번째 사탕 맛 : "+translateFlavor(flavor));
			System.out.println(i+"번째 사탕 모양 : "+translateShape(shape));
			
			System.out.println("=================");
		}
		
		System.out.println("==================");
	}
	

}
