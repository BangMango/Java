package instanceOfExample2;

public class CatMountain {
	public static void printInstanceNameCorrectly(Cat cat) {
		if(cat instanceof Somi) {
			System.out.println("나는 소미다냥");
		}else if(cat instanceof Semi) {
			System.out.println("나는 세미다냥");
		}else if(cat instanceof Sumi) {
			System.out.println("나는 수미다냥");
		}else {
			System.out.println("나는 고양이다냥");
		}
	}
	
	public static void main(String[] args) {
		Cat cat=new Cat();
		Cat somi=new Somi();
		Cat semi=new Semi();
		Cat sumi=new Sumi();
		
		printInstanceNameCorrectly(cat);
		printInstanceNameCorrectly(somi);
		printInstanceNameCorrectly(semi);
		printInstanceNameCorrectly(sumi);
	}
}
