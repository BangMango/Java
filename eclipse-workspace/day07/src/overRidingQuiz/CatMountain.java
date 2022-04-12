package overRidingQuiz;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		YoungCat yc=new YoungCat();
		cat.walk(); cat.run(); System.out.println(cat.getChurCntFromPocket());
		System.out.println("-----------------------------");
		yc.walk(); yc.run(); System.out.println(yc.getChurCntFromPocket());

	}

}
