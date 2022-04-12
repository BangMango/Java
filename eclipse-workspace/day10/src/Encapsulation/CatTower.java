package Encapsulation;

public class CatTower {
	
	//캡슐화의 장점
	//
	
	//닫힌 변수
	private Integer supportCnt=4;
	private Integer fixtureCnt = 4;
	
	//열린 함수
	// supportCnt는 오직 getSupportCnt를 통해서만 접근할 수 있다.
	public Integer getSupportCnt() {
		return supportCnt;
	}
	// supportCnt는 오직 setSupportCnt를 통해서만 선언(할당)할 수 있다.
	public void setSupportCnt(Integer supportCnt) {
		this.supportCnt=supportCnt;
	}
	
	public Integer getFixtureCnt() {
		return fixtureCnt;
	}
	public void setFixtureCnt(Integer fixtureCnt) {
		this.fixtureCnt=fixtureCnt;
	}
}
