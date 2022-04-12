package exceptionExample3;

public class Main {

	public static void main(String[] args) {
		Integer [] errorArray=new Integer[] {808,909,555,111,444};
		for(int i=0;i<=errorArray.length;i++) {
			try {
				System.out.println("출력 결과"+errorArray[i]);
			}catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("에러");
				System.out.println(exception.getMessage());
			}finally {
				System.out.println("무조건 실행코드");
			}
		}

	}

}
