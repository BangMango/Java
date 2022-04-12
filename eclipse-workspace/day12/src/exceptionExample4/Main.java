package exceptionExample4;

public class Main {

	public static void main(String[] args) {
		Integer[] errorArray =new Integer[] {808,909,555,111,444};
		
		try {
			for(int i=0;i<errorArray.length;i++) {
				if(i==2) {
					throw new Exception();
					//throw가 실행되면 try내의 로직이 더 이상 작동하지 않는다.
				}
				System.out.println("출력 : "+errorArray[i]);
			}
		}catch(Exception exception){
			System.out.println("Throw실행");
		}finally {
			System.out.println("무조건 출력");
		}

	}

}
