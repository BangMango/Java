package exceptionExample4;

public class Main {

	public static void main(String[] args) {
		Integer[] errorArray =new Integer[] {808,909,555,111,444};
		
		try {
			for(int i=0;i<errorArray.length;i++) {
				if(i==2) {
					throw new Exception();
					//throw�� ����Ǹ� try���� ������ �� �̻� �۵����� �ʴ´�.
				}
				System.out.println("��� : "+errorArray[i]);
			}
		}catch(Exception exception){
			System.out.println("Throw����");
		}finally {
			System.out.println("������ ���");
		}

	}

}
