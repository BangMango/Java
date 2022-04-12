package overLoading;

public class Tray {

	public static void main(String[] args) {
		SmallMac smallMac=new SmallMac();
		
		smallMac.setIngredients("RED_LEAF", "GREEN");
		
		smallMac.setIngredients("RED_LEAF", "GREEN", "CHEDAR");
		
		smallMac.setIngredients("RED_LEAF", "GREEN", "CHEDAR", "GREEN_ONION");
		
		smallMac.setIngredients("RED_LEAF", "GREEN","CHEDAR","GREEN_ONION","COW");
		System.out.println("SmallMac Ingredients : "+smallMac.lettuce.getLettuceType());
		System.out.println("SmallMac Ingredients : "+smallMac.tomato.getTomatoType());
		System.out.println("SmallMac Ingredients : "+smallMac.cheese.getCheeseType());
		System.out.println("SmallMac Ingredients : "+smallMac.onion.getOnionType());
		System.out.println("SmallMac Ingredients : "+smallMac.patty.getPattyType());
	}

}
