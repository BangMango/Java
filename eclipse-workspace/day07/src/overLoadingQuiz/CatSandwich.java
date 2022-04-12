package overLoadingQuiz;


public class CatSandwich extends Sandwich{
	CatSandwich(){
		this.bread=new Bread();
		this.lettuce=new Lettuce();
		this.tomato=new Tomato();
		this.cheese=new Cheese();
		this.onion=new Onion();
		this.patty=new Patty();
	}
	
	public void setIngredients(String lettuceType, String tomatoType, String cheeseType, String onionType, String pattyType) {
		this.lettuce.type=lettuceType;
		this.tomato.type=tomatoType;
		this.cheese.type=cheeseType;
		this.onion.type=onionType;
		this.patty.type=pattyType;
	}
}
