package Encapsulation;

public class CatTower {
	
	//ĸ��ȭ�� ����
	//
	
	//���� ����
	private Integer supportCnt=4;
	private Integer fixtureCnt = 4;
	
	//���� �Լ�
	// supportCnt�� ���� getSupportCnt�� ���ؼ��� ������ �� �ִ�.
	public Integer getSupportCnt() {
		return supportCnt;
	}
	// supportCnt�� ���� setSupportCnt�� ���ؼ��� ����(�Ҵ�)�� �� �ִ�.
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
