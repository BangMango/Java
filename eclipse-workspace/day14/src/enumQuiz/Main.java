package enumQuiz;

public class Main {
	public static void validateCandyType(CandyType candyType) {
		if(candyType==candyType.GINGER) {
			System.out.println("ª˝∞≠ ∏¿ ªÁ≈¡");
		}else if(candyType==candyType.FRUITY) {
			System.out.println("∞˙¿œ ∏¿ ªÁ≈¡");
		}else if(candyType==candyType.BUTTER) {
			System.out.println("πˆ≈Õ ∏¿ ªÁ≈¡");
		}else if(candyType==candyType.HONEY) {
			System.out.println("≤‹ ∏¿ ªÁ≈¡");
		}
	}
	public static void main(String[] args) {
		CandyType candyType=CandyType.HONEY;
		validateCandyType(candyType);

	}

}
