package exceptionExample2;

public class Main {
	//원하는 부분만 예외처리 (try~catch)
	//특정 로직에서 에러 (throws)
	public static void main(String[] args) {
		Integer churCnt=10;
		if(churCnt>=5) {
			System.out.println("소미 : 추르냥냥");
		}else {
			System.out.println("소미 : 츄르가 없다옹");
		}

	}

}
