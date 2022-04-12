package overRidingQuiz;

public class YoungCat extends Cat{

	@Override
	public void walk() {
		System.out.println("»Ð»Ð»Ð");
	}

	@Override
	public void run() {
		System.out.println("¶Ñ¹÷¶Ñ¹÷");
	}

	@Override
	public Integer getChurCntFromPocket() {
		return 4;
	}
	
}
