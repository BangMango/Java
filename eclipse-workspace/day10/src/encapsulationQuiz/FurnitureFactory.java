package encapsulationQuiz;

public class FurnitureFactory {

	public static void main(String[] args) {
		Table t=new Table();
		t.setLegCnt(4); t.setCircleCnt(1);
		System.out.println("다리 "+t.getLegCnt()+"개에 원반 "+t.getCircleCnt()+"개 짜리 가구가 조립되었습니다.");
		t.setLegCnt(6);
		System.out.println("다리 "+t.getLegCnt()+"개에 원반 "+t.getCircleCnt()+"개 짜리 가구가 재조립되었습니다.");

	}

}
