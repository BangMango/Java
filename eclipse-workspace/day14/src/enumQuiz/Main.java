package enumQuiz;

public class Main {
	public static void validateCandyType(CandyType candyType) {
		if(candyType==candyType.GINGER) {
			System.out.println("���� �� ����");
		}else if(candyType==candyType.FRUITY) {
			System.out.println("���� �� ����");
		}else if(candyType==candyType.BUTTER) {
			System.out.println("���� �� ����");
		}else if(candyType==candyType.HONEY) {
			System.out.println("�� �� ����");
		}
	}
	public static void main(String[] args) {
		CandyType candyType=CandyType.HONEY;
		validateCandyType(candyType);

	}

}
