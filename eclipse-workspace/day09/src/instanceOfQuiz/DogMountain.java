package instanceOfQuiz;

public class DogMountain {
	public static void instanceOfCorrectly(Dog dog) {
		if(dog instanceof Duchi) {
			System.out.println("���� ��ġ");
		}else if(dog instanceof Bbuggu) {
			System.out.println("���� �Ѳ�");
		}else {
			System.out.println("���� �ƱⰭ����");
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
