package instanceOfExample;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		Somi somi=new Somi();
		
		System.out.println(cat instanceof Cat); //cat 변수가 Cat 클래스의 인스턴스가 맞는지
		System.out.println(somi instanceof Cat);//somi 벼수가 Cat 클래스의 인스턴스가 맞는지
		System.out.println(cat instanceof Somi);// cat 변수가 Somi 클래스의 인스턴스가 맞는지
		System.out.println(somi instanceof Somi);// somi변수가 Somi 클래스의 인스턴스가 맞는지
	}

}
