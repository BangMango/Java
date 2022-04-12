package overLoadingQuiz;

public class Tray {

	public static void main(String[] args) {
		CatSandwich cs=new CatSandwich();
		
		cs.setIngredients("CABBAGE", "GREEN", "CEHDAR", "GREEN_ONION", "COW");
		System.out.println("CatSandwich Ingredients : "+cs.bread.type);
		System.out.println("CatSandwich Ingredients : "+cs.lettuce.type);
		System.out.println("CatSandwich Ingredients : "+cs.tomato.type);
		System.out.println("CatSandwich Ingredients : "+cs.cheese.type);
		System.out.println("CatSandwich Ingredients : "+cs.onion.type);
		System.out.println("CatSandwich Ingredients : "+cs.patty.type);
	}

}
