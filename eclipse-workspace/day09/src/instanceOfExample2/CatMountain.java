package instanceOfExample2;

public class CatMountain {
	public static void printInstanceNameCorrectly(Cat cat) {
		if(cat instanceof Somi) {
			System.out.println("���� �ҹ̴ٳ�");
		}else if(cat instanceof Semi) {
			System.out.println("���� ���̴ٳ�");
		}else if(cat instanceof Sumi) {
			System.out.println("���� ���̴ٳ�");
		}else {
			System.out.println("���� ����̴ٳ�");
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
