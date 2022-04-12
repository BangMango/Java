package day03;

public class Main {
	
	public static void pleaseCallMe(Integer testNumber) {
		if(testNumber==0) {
			System.out.println("testNumber 이제 그만");
		}else {
			System.out.println("testNumber 호출 ->"+testNumber);
			testNumber=testNumber-1;
			pleaseCallMe(testNumber);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pleaseCallMe(19);
	}

}
