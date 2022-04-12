package instanceOfQuiz;

public class DogMountain {
	public static void instanceOfCorrectly(Dog dog) {
		if(dog instanceof Duchi) {
			System.out.println("나는 두치");
		}else if(dog instanceof Bbuggu) {
			System.out.println("나는 뿌꾸");
		}else {
			System.out.println("나는 아기강아지");
		}
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		Dog duchi=new Duchi();
		Dog bbuggu=new Bbuggu();
		instanceOfCorrectly(dog);
		instanceOfCorrectly(duchi);
		instanceOfCorrectly(bbuggu);
	}

}
