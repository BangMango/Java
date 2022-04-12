package typeCastingExample;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 조상 변수 = new 자손클래스
		Cat cat3=new Somi();
		//cat3.run();
		//((Somi)cat3).run();
		
		//2
		Somi somi4=(Somi)new Cat();
		
		//3
		Cat cat=null;
		Somi somi=new Somi();
		
		cat=somi;
		
		((Somi)cat).run();
		
		//4
		Cat cat2=new Cat();
		Somi somi2=null;
		somi2=(Somi) cat2;
	//	cat2.run();
		
	}

}
