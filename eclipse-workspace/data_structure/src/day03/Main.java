package day03;

public class Main {
	
	public static void pleaseCallMe(Integer testNumber) {
		if(testNumber==0) {
			System.out.println("testNumber ���� �׸�");
		}else {
			System.out.println("testNumber ȣ�� ->"+testNumber);
			testNumber=testNumber-1;
			pleaseCallMe(testNumber);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pleaseCallMe(19);
	}

}
