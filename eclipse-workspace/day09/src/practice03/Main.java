package practice03;

public class Main {
	public static void printUserName(String userName) {
		
	}
	public static void printUser(User user) {
		System.out.println();
		System.out.println("������ȣ : "+user.userNo);
		System.out.println("�����̸� : "+user.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		user.userNo=1L;
		user.name="�����";
		
		printUser(user);
			
	}

}
