package exceptionExample;

public class Main {

	public static void main(String[] args) {
		Integer[] errorArray = new Integer[] {808, 909, 555, 111, 444};

		System.out.println("첫번째! 과연, 나는 실행될 수 있을까? -> " + errorArray[4]);
		System.out.println("두번째! 과연, 나는 실행될 수 있을까? -> " + errorArray[5]);

	}

}
